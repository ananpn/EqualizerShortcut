package com.example.equalizershortcut

import android.content.Intent
import android.media.audiofx.AudioEffect
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val settingsIntent = Intent(AudioEffect.ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL)
        startActivityForResult(settingsIntent, 0)
        finishAffinity()
    }

    override fun onResume() {
        super.onResume()
        val settingsIntent = Intent(AudioEffect.ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL)
        startActivityForResult(settingsIntent, 0)
        finishAffinity()
    }

}