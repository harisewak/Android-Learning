package com.harisewak.listviewvsrecyclerview.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.harisewak.listviewvsrecyclerview.R
import com.harisewak.listviewvsrecyclerview.databinding.ActivityListViewBinding
import com.harisewak.listviewvsrecyclerview.other.ListItem
import com.harisewak.listviewvsrecyclerview.other.TestDataProvider

class ListViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        val userList = TestDataProvider.getListData()
        val lv: ListView = findViewById<View>(R.id.user_list) as ListView
        lv.setAdapter(ListViewAdapter(this, userList))
        lv.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(a: AdapterView<*>?, v: View?, position: Int, id: Long) {
                val user = lv.getItemAtPosition(position) as ListItem
                Toast.makeText(
                    this@ListViewActivity,
                    "Selected :" + " " + user.name + ", " + user.location,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}