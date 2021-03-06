package com.example.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chatList = dummyData()
        val chatView = findViewById<RecyclerView>(R.id.chatsView)
        chatView.adapter = chatAdaptor(chatList)
        chatView.layoutManager =  LinearLayoutManager(this)

    }
    private fun dummyData (): List<chatItem>{
        val list = ArrayList<chatItem>()
        list.add(chatItem(R.drawable.ic_profile_picture,"Areesha", "Ap kaha hyn?"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Akmal", "Yar bike free hai? "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Mohsin", "Class nhi leni? "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Shahnil", "Kal 4 bjy meeting ha"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Noman", "Dhoky baz haseena"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Abdul Aziz", "Yar Ma gujrat ja ra hu"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Samiya Ijaz", "Proposal submit ho gya ha "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Hamza", "Footbal khelny ja ra hu"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Areesha", "Ap kaha hyn?"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Akmal", "Yar bike free hai? "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Mohsin", "Class nhi leni? "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Shahnil", "Kal 4 bjy meeting ha"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Noman", "Dhoky baz haseena"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Abdul Aziz", "Yar Ma gujrat ja ra hu"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Samiya Ijaz", "Proposal submit ho gya ha "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Hamza", "Footbal khelny ja ra hu"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Areesha", "Ap kaha hyn?"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Akmal", "Yar bike free hai? "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Mohsin", "Class nhi leni? "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Shahnil", "Kal 4 bjy meeting ha"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Noman", "Dhoky baz haseena"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Abdul Aziz", "Yar Ma gujrat ja ra hu"))
        list.add(chatItem(R.drawable.ic_profile_picture,"Samiya Ijaz", "Proposal submit ho gya ha "))
        list.add(chatItem(R.drawable.ic_profile_picture,"Hamza", "Footbal khelny ja ra hu"))
        return list
    }
}