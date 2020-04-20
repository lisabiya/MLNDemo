
package com.debby.mlnsample.provider;

import android.content.Context;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.request.RequestOptions;

import org.jetbrains.annotations.NotNull;

/**
 * configuration for glide
 */
public class GlideConfiguration implements GlideModule {

    @Override
    public void applyOptions(@NotNull Context context, GlideBuilder builder) {
        // Apply options to the builder here.
        builder.setDefaultRequestOptions(new RequestOptions()
                .apply(new RequestOptions().format(DecodeFormat.PREFER_ARGB_8888)));
    }

    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {

    }
}