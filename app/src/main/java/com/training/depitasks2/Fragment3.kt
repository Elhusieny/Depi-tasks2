package com.training.depitasks2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.training.depitasks2.databinding.Fragment3Binding


class Fragment3 : Fragment() {

    private lateinit var binding: Fragment3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_3, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.colors.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment1)
        }
        binding.family.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment2)
        }
        binding.musicApp.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragmentMusicApp)
        }



    }

    }
