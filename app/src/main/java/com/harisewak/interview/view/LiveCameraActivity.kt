package com.harisewak.interview.view

import android.app.Activity
import android.graphics.SurfaceTexture
import android.hardware.Camera
import android.os.Bundle
import android.view.TextureView
import android.view.TextureView.SurfaceTextureListener
import java.io.IOException


class LiveCameraActivity : Activity(), SurfaceTextureListener {
    private lateinit var mCamera: Camera
    private var mTextureView: TextureView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mTextureView = TextureView(this)
        mTextureView!!.surfaceTextureListener = this
        setContentView(mTextureView)
    }

    override fun onSurfaceTextureAvailable(surface: SurfaceTexture, width: Int, height: Int) {
        mCamera = Camera.open()
        try {
            mCamera.setPreviewTexture(surface)
            mCamera.startPreview()
        } catch (ioe: IOException) {
            // Something bad happened
        }
    }

    override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture, width: Int, height: Int) {
        // Ignored, Camera does all the work for us
    }

    override fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {
        mCamera.stopPreview()
        mCamera.release()
        return true
    }

    override fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
        // Invoked every time there's a new Camera preview frame
    }
}