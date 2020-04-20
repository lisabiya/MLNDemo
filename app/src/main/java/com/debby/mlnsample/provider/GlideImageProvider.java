package com.debby.mlnsample.provider;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCache;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.immomo.mls.provider.DrawableLoadCallback;
import com.immomo.mls.provider.ImageProvider;

import java.lang.ref.WeakReference;

public class GlideImageProvider implements ImageProvider {
    private static final LruCache<String, Integer> IdCache = new LruCache<>(50);
    @Override
    public void pauseRequests(final ViewGroup view, Context context) {
        Glide.with(context).pauseRequests();
    }

    @Override
    public void resumeRequests(final ViewGroup view, Context context) {
        if (context instanceof Activity && (((Activity) context).isFinishing() || ((Activity) context).isDestroyed())) {
            return;
        }
        if (Glide.with(context).isPaused()) {
            Glide.with(context).resumeRequests();
        }
    }

    /**
     * load url
     *  @param url
     * @param placeHolder
     * @param callback
     */
    public void load(@NonNull Context context, @NonNull ImageView imageView, @NonNull String url,
                     String placeHolder, @Nullable RectF radius, @Nullable DrawableLoadCallback callback) {
        RequestBuilder builder;
        if (callback != null) {
            final WeakReference<DrawableLoadCallback> cf = new WeakReference<DrawableLoadCallback>(callback);
            builder = Glide.with(context).load(url).listener(new RequestListener<Drawable>() {
                @Override
                public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                    if (e != null)
                        e.printStackTrace();
                    if (cf.get() != null) {
                        cf.get().onLoadResult(null, e != null ? e.getMessage() : null);
                    }
                    return false;
                }

                @Override
                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                    if (cf.get() != null) {
                        cf.get().onLoadResult(resource, null);
                    }
                    return false;
                }
            });
        } else {
            builder = Glide.with(context).load(url);
        }
        if (placeHolder != null) {
            int id = ResourcesUtils.getResourceIdByUrl(placeHolder, null, ResourcesUtils.TYPE.DRAWABLE);
            if (id > 0) {
                builder = builder.apply(new RequestOptions().placeholder(id));
            }
        }
        builder.into(imageView);
    }

    @Override
    public void loadWithoutInterrupt(@NonNull Context context, @NonNull ImageView iv, @NonNull String url,
                                     String placeHolder, @Nullable RectF radius, @Nullable DrawableLoadCallback callback) {
        load(context.getApplicationContext(), iv, url, placeHolder, radius, callback);
    }

    private static int getProjectImageId(String name) {
        Integer result = IdCache.get(name);
        if (result != null) {
            return result;
        }
        int id = ResourcesUtils.getResourceIdByName(name, ResourcesUtils.TYPE.DRAWABLE);
        IdCache.put(name, id);
        return id;
    }

    @Override
    public Drawable loadProjectImage(Context context, String name) {
        if (TextUtils.isEmpty(name))
            return null;
        int id = getProjectImageId(name);
        if (id > 0) {
            return context.getResources().getDrawable(id);
        }
        return null;
    }

    @Override
    public void preload(@NonNull final Context context, @NonNull String url, @Nullable RectF radius, @Nullable final DrawableLoadCallback callback) {
        RequestBuilder builder;
        if (callback != null) {
            builder = Glide.with(context).load(url).listener(new RequestListener<Drawable>() {

                @Override
                public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                    callback.onLoadResult(null, e != null ? e.getMessage() : null);
                    return false;
                }

                @Override
                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                    callback.onLoadResult(resource, null);
                    return false;
                }
            });
        } else {
            builder = Glide.with(context).load(url);
        }
        builder.preload();
    }
}