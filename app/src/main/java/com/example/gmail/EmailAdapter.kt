package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList : List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {
    class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val senderInitial: TextView = view.findViewById(R.id.senderInitial)
        val senderName: TextView = view.findViewById(R.id.senderName)
        val emailSubject: TextView = view.findViewById(R.id.emailSubject)
        val emailSnippet: TextView = view.findViewById(R.id.emailSnippet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)
        return EmailViewHolder(view);
    }

    override fun getItemCount(): Int = emailList.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.senderInitial.text = email.sender.first().toString()  // Lấy ký tự đầu tiên
        holder.senderName.text = email.sender
        holder.emailSubject.text = email.subject
        holder.emailSnippet.text = email.snippet
    }
}