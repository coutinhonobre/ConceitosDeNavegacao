package com.github.coutinhonobre.conceitos.navegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvList: RecyclerView by lazy {
        findViewById(R.id.rv_list)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewBinds()
    }

    private fun viewBinds() {
        val list: MutableList<Contact> = mutableListOf()
        insertList(list)
        rvList.apply {
            adapter = ContractAdapter(list = list)
            layoutManager = LinearLayoutManager(this@MainActivity)

        }
    }

    private fun insertList(list: MutableList<Contact>) {
        for (i in 1..4) {
            list.add(
                Contact(
                    name = "Name $i",
                    phone = "(0$i) ${i}0000-0000",
                    photograph = ""
                )
            )
        }
    }
}