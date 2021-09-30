package com.example.whatsappui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class chatAdaptor(private val chatList: List<chatItem>): RecyclerView.Adapter<chatAdaptor.chatViewHolder>() {
    class chatViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.profile_picture)
        val chatName: TextView = itemView.findViewById(R.id.chat_name)
        val chatMessage: TextView = itemView.findViewById(R.id.chat_message)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chatViewHolder {
        val itemView = LayoutInflater.from(parent.context ).inflate(R.layout.individual_chat,parent,false)
        return chatViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: chatViewHolder, position: Int) {
        val currentItem = chatList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.chatName.text = currentItem.chatName
        holder.chatMessage.text = currentItem.chatMessage
    }

    override fun getItemCount() = chatList.size

}