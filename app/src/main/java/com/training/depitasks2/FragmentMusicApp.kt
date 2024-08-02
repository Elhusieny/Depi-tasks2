package com.training.depitasks2

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil
import com.training.depitasks2.databinding.FragmentMusicAppBinding

class FragmentMusicApp : Fragment() {

    private lateinit var binding: FragmentMusicAppBinding
    private lateinit var mediaPlayer: MediaPlayer
    private var isPlaying = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_music_app, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize the MediaPlayer with the sound file
        mediaPlayer = MediaPlayer.create(requireContext(), R.raw.song)

        // Find the ImageButton and set an OnClickListener
        val buttonToggleSound: ImageButton = binding.buttonToggleSound
        buttonToggleSound.setOnClickListener {
            if (isPlaying) {
                // Stop the sound
                mediaPlayer.pause()
                mediaPlayer.seekTo(0)
                buttonToggleSound.setImageResource(R.drawable.start)
            } else {
                // Start the sound
                mediaPlayer.start()
                buttonToggleSound.setImageResource(R.drawable.pause)
            }
            isPlaying = !isPlaying
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // Release the MediaPlayer resources
        if (::mediaPlayer.isInitialized) {
            mediaPlayer.release()
        }
    }
}
