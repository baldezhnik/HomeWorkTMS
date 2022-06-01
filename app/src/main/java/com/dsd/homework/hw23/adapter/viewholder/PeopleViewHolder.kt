package com.dsd.homework.hw23.adapter.viewholder

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
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
                itemView.findNavController().navigate(R.id.action_HW23Fragment_to_HW19Fragment2)
            }
        }
    }
}
