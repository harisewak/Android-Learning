package com.harisewak.launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class FourthActivity : AppCompatActivity() {

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "FourthActivity onNewIntent: called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "FourthActivity onDestroy: called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        findViewById<View>(R.id.fab).setOnClickListener {
            Log.d(TAG, "launching SecondActivity")
            val intent = Intent(this@FourthActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

}