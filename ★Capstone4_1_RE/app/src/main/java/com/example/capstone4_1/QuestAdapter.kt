package com.example.capstone4_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class QuestAdapter(val context: Context): BaseAdapter() {
    class ViewHolder {
        lateinit var name: TextView
        lateinit var explain: TextView
        lateinit var imageView: ImageView
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.quest, parent, false)

        val viewHolder = ViewHolder().apply {
            name = view.findViewById<TextView>(R.id.quest_name)
            explain = view.findViewById<TextView>(R.id.quest_explain)
            imageView = view.findViewById<ImageView>(R.id.image)
        }

        viewHolder.apply {
           name.setText(Character.questList[position].name)
           explain.setText(Character.questList[position].explain)
           imageView.setImageResource(Character.questList[position].image)
        }

        return view
    }

    //리스트 갯수
    override fun getCount(): Int {
        return Character.questList.size
    }

    override fun getItem(position: Int): Any {
        return Character.questList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
}