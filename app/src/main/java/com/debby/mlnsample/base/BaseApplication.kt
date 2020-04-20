package com.debby.mlnsample.base

import android.app.Application
import android.os.Environment
import com.debby.mlnsample.provider.GlideImageProvider
import com.immomo.mlncore.BuildConfig
import com.immomo.mls.MLSEngine
import com.immomo.mls.global.LVConfigBuilder


/**
 * Create by wakfu on 2020/4/20
 *
 */
class BaseApplication : Application() {
    companion object {
        private lateinit var app: BaseApplication

        fun getApp(): BaseApplication? {
            return app
        }

        fun getPackageNameImpl(): String? {
            var sPackageName: String = app.packageName
            if (sPackageName.contains(":")) {
                sPackageName = sPackageName.substring(0, sPackageName.lastIndexOf(":"))
            }
            return sPackageName
        }
    }

    private var sdcardDir: String = ""

    override fun onCreate() {
        super.onCreate()
        app = this
        init()
    }

    private fun init() {
        initParams()
        MLSEngine.init(app, BuildConfig.DEBUG)
            .setLVConfig(
                LVConfigBuilder(app)
                    .setRootDir(sdcardDir) //设置lua根目录
                    .setImageDir("${sdcardDir}image") //设置lua图片根目录
                    .setCacheDir("${sdcardDir}cache") //设置lua缓存目录
                    .setGlobalResourceDir("${sdcardDir}g_res") //设置资源文件目录
                    .build()
            )
            .setImageProvider(GlideImageProvider()) //lua加载图片工具，不实现的话，图片无法展示
            .build(true)
    }

    private fun initParams() {
        try {
            sdcardDir = Environment.getExternalStorageDirectory().absolutePath
            if (sdcardDir.endsWith("/")) {
                sdcardDir += "/"
            }
            sdcardDir += "MLN_Android/"
        } catch (e: Exception) {
        }
    }


}