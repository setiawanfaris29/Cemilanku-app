package com.example.cemilanku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Toolbar
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.list.*


class MainActivity : AppCompatActivity() {
    val list = ArrayList<DataCemilan>()
    val makanan = arrayOf(
        "Bakso bakar",
        "Sosis Bakar",
        "Keju bakar",
        "Cilok",
        "Tempe bacem",
        "Sayur asem"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mGridLayoutManager = GridLayoutManager(this@MainActivity, 2)
        mRecyclerView.layoutManager = mGridLayoutManager
        for (i in 0 until makanan.size) {

            list.add(DataCemilan(makanan.get(i)))

            if (makanan.size - 1 == i) {
                // init adapter yang telah dibuat tadi
                val adapter = RecycleViewAdapter(this, list)
                adapter.notifyDataSetChanged()

                //tampilkan data dalam recycler view
                mRecyclerView.adapter = adapter
            }

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_oke, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show()
        when (item.getItemId()) {
            R.id.centercall->
                // do your code
                return true
            R.id.sms ->
                // do your code
                return true
            R.id.lokasi ->
                // do your code
                return true
            R.id.user ->
                // do your code
                return true
            else -> return super.onOptionsItemSelected(item)
        }
    }
}

