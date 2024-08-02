package com.training.depitasks2

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.training.depitasks2.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var binding:Fragment1Binding
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_1,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvWhite.setOnClickListener {


            // Initialize the MediaPlayer with the sound file
            mediaPlayer = MediaPlayer.create(requireContext(), R.raw.white);
            mediaPlayer.start();

        }
        binding.tvBlue.setOnClickListener {


            // Initialize the MediaPlayer with the sound file
            mediaPlayer = MediaPlayer.create(requireContext(), R.raw.blue);
            mediaPlayer.start();

        }
        binding.tvBlack.setOnClickListener {


            // Initialize the MediaPlayer with the sound file
            mediaPlayer = MediaPlayer.create(requireContext(), R.raw.black);
            mediaPlayer.start();

        }
        binding.tvRed.setOnClickListener {


            // Initialize the MediaPlayer with the sound file
            mediaPlayer = MediaPlayer.create(requireContext(), R.raw.red);
            mediaPlayer.start();

        }
        binding.tvGreen.setOnClickListener {


            // Initialize the MediaPlayer with the sound file
            mediaPlayer = MediaPlayer.create(requireContext(), R.raw.green);
            mediaPlayer.start();

        }
    }

}