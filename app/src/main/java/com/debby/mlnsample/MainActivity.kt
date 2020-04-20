package com.debby.mlnsample

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.immomo.mls.InitData
import com.immomo.mls.MLSInstance


class MainActivity : AppCompatActivity() {
    private lateinit var instance: MLSInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val frameLayout = FrameLayout(this)
        setContentView(frameLayout)
        instance = MLSInstance(this, true, true)
        instance.setContainer(frameLayout)
        val initData =
            InitData("file://android_asset/index.lua") //MLSBundleUtils.parseFromBundle(bundle);MLSBundleUtils.createBundle(url)
        instance.setData(initData)
        if (!instance.isValid) { //非法url

        }
    }

    override fun onResume() {
        super.onResume()
        instance.onResume()
    }

    override fun onPause() {
        instance.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        instance.onDestroy()
        super.onDestroy()
    }
}
