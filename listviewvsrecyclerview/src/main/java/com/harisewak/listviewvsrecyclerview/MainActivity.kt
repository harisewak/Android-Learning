package com.harisewak.listviewvsrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harisewak.listviewvsrecyclerview.databinding.ActivityMainBinding
import com.harisewak.listviewvsrecyclerview.listview.ListViewActivity
import com.harisewak.listviewvsrecyclerview.recyclerview.RecyclerViewActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding) {

            btListView.setOnClickListener {
                startActivity(Intent(this@MainActivity, ListViewActivity::class.java))
            }

            btRecyclerView.setOnClickListener {
                startActivity(Intent(this@MainActivity, RecyclerViewActivity::class.java))
            }

        }
    }
}