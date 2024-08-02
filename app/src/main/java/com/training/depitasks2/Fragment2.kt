package com.training.depitasks2

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.training.depitasks2.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    private lateinit var binding: Fragment2Binding
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_2, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.father.setOnClickListener{
            mediaPlayer=MediaPlayer.create(requireContext(),R.raw.father)
            mediaPlayer.start();

        }
        binding.grandF.setOnClickListener {
            mediaPlayer=MediaPlayer.create(requireContext(),R.raw.grandfather)
            mediaPlayer.start();

        }
        binding.mother.setOnClickListener{
            mediaPlayer=MediaPlayer.create(requireContext(),R.raw.mother)
            mediaPlayer.start();

        }
        binding.grandM.setOnClickListener{
            mediaPlayer=MediaPlayer.create(requireContext(),R.raw.grandmother)
            mediaPlayer.start();

        }
    }
    }