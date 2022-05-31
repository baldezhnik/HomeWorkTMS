package com.dsd.homework.hw23.adapter.viewholder

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dsd.homework.R
import com.dsd.homework.databinding.ItemUserBinding
import com.dsd.homework.hw19.HW19Fragment
import com.dsd.homework.hw23.UserWithImage

class PeopleViewHolder(private val itemBinding : ItemUserBinding): RecyclerView.ViewHolder(itemBinding.root) {

    fun bind (user: UserWithImage){
        with(itemBinding){
            tvName.text = user.name
            tvSecondName.text = user.secondName
            tvAge.text = user.age.toString()
            Glide.with(itemView.context)
                .load(user.photo)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(ivPhoto)
            ivPhoto.setOnClickListener{
                val context = itemView.context as AppCompatActivity
                context.supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host, HW19Fragment()).commit()
            }
        }
    }
}
