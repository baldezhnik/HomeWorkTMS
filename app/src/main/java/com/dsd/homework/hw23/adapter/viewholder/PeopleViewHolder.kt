package com.dsd.homework.hw23.adapter.viewholder
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dsd.homework.R
import com.dsd.homework.databinding.ItemUserBinding
import com.dsd.homework.hw23.FullScreenPhotoFragment
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
                .placeholder(R.drawable.ic_baseline_cloud_download_24)
                .error(R.drawable.ic_baseline_error_outline_24)
                .into(ivPhoto)
            ivPhoto.setOnClickListener{
                itemView.findNavController().navigate(
                    R.id.action_HW23Fragment_to_fullScreenPhotoFragment,
                    bundleOf(FullScreenPhotoFragment.uriUserPhoto to user.photo)
                    )
            }
        }
    }
}
