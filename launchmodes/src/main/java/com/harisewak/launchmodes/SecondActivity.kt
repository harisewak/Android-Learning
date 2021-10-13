package com.harisewak.launchmodes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.harisewak.launchmodes.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "SecondActivity onNewIntent: called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "SecondActivity onDestroy: called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<View>(R.id.fab).setOnClickListener {
            Log.d(TAG, "launching ThirdActivity")
            startActivity(Intent(this@SecondActivity, ThirdActivity::class.java))
        }
    }


}