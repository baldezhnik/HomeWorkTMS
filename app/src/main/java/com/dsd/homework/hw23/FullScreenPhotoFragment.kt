package com.dsd.homework.hw23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dsd.homework.R
import com.dsd.homework.databinding.FragmentFullScreenPhotoBinding

class FullScreenPhotoFragment : Fragment() {

    private var _binding: FragmentFullScreenPhotoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFullScreenPhotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(this)
            .load(arguments?.getString(URI_USER_PHOTO))
            .placeholder(R.drawable.ic_baseline_cloud_download_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .into(binding.ivFullScreenPhoto)
    }

    companion object {
    const val URI_USER_PHOTO = "URI"
    }
}