package com.harisewak.listviewvsrecyclerview.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.harisewak.listviewvsrecyclerview.R
import com.harisewak.listviewvsrecyclerview.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.recyclerView.apply {
            adapter = RecyclerViewAdapter()
            layoutManager = LinearLayoutManager(
                applicationContext
            )
        }
    }
}