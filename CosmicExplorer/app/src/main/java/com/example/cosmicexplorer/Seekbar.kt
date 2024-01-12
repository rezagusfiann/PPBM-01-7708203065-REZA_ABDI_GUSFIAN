package com.example.cosmicexplorer

import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class Seekbar : AppCompatActivity() {

    private lateinit var audioManager: AudioManager
    private lateinit var volumeSeekBar: SeekBar
    private lateinit var volumeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar)

        audioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        volumeSeekBar = findViewById(R.id.volumeSeekBar)
        volumeTextView = findViewById(R.id.volumeTextView)

        // Set the max volume for the SeekBar
        val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        volumeSeekBar.max = maxVolume

        // Set the initial volume and update the TextView
        val currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
        volumeSeekBar.progress = currentVolume
        volumeTextView.text = "Volume: $currentVolume%"

        // SeekBar listener to change volume
        volumeSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0)
                volumeTextView.text = "Volume: $progress%"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Not needed for volume control
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Not needed for volume control
            }
        })
    }}