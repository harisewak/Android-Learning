package com.harisewak.launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ThirdActivity : AppCompatActivity() {

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "ThirdActivity onNewIntent: called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "ThirdActivity onDestroy: called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        findViewById<View>(R.id.fab).setOnClickListener {
            Log.d(TAG, "launching FourthActivity")
            startActivity(Intent(this@ThirdActivity, FourthActivity::class.java))
        }
    }

}