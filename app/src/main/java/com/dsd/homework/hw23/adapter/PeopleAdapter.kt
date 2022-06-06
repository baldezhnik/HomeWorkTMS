package com.dsd.homework.hw23.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dsd.homework.databinding.ItemUserBinding
import com.dsd.homework.hw23.UserWithImage
import com.dsd.homework.hw23.adapter.viewholder.PeopleViewHolder

class PeopleAdapter(private val users: MutableList<UserWithImage>) : RecyclerView.Adapter<PeopleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val itemBinding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PeopleViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int = users.size

}
