package com.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var items: MutableList<NegaraModel> = mutableListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        rv_team_list.layoutManager = LinearLayoutManager(this)
        rv_team_list.adapter = NegaraAdapter(this, items)


    }


    private fun initData(){
        val name = resources.getStringArray(R.array.nama_negara)
        val image = resources.obtainTypedArray(R.array.negara_image)
        items.clear()
        for (i in name.indices) {
            items.add(NegaraModel(name[i],
                    image.getResourceId(i, 0)))
        }

        //Recycle the typed array
        image.recycle()
    }
}