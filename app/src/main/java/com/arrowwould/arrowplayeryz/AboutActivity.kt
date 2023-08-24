package com.arrowwould.arrowplayeryz

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arrowwould.arrowplayeryz.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.themesList[MainActivity.themeIndex])
        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        supportActionBar?.title = "Function"
        binding.aboutText.text = " Arrow player , play HD videos and all video formats\n" +
                "\n" +
                "Besides music player to play music files, video\n" +
                "\n" +
                "player is a utility tool to play video files.\n" +
                "\n" +
                "Our video player is a powerful player. It can play all\n" +
                "\n" +
                "video formats: mp4, avi, wmv, mkv, ...\n" +
                "\n" +
                "You can change the playback speed, choose the audio stream in the video (for example, a video with multiple language audio streams). It supports subtitle display and has a powerful equalizer."

        binding.FunctionText.text = "\n" +
                "List of functions:\n" +
                "\n" +
                "-play HD videos and all video formats (mp4, mov, - 3gp, mkv, ...)\n" +
                "\n" +
                "- many scaling options: original, stretched, 16:9,\n" +
                "\n" +
                "9:16, 4:3, ... - fast forward and backward with 10, 30, 60\n" +
                "\n" +
                "seconds - support video with multiple audio streams. You\n" +
                "\n" +
                "can choose the stream you want\n" +
                "\n" +
                "- powerful equalizer - easily change playback speed from 0.5 to 2.0 - support subtitle display. It let you show/hide subtitles and customize subtitles (color, font size, display delay)\n" +
                "\n" +
                "- remember the last position. It starts playing video\n" +
                "\n" +
                "files from the position where you left off last time. This is a wonderful feature especially for those who can't watch movies in one go due to time constraints.\n" +
                "\n" +
                "- set timer to stop playing - support music. It can also play music files as a music player. It has categories: albums, artists, folders.\n \n" +
                "Install the arrow player max today to watch your videos in the most professional way. Also, share your feedback on Amazon AppStore if you like it.\n" +
                "\n" +
                "If you have any problem with our video player, feel\n" +
                "\n" +
                "free to contact us: arrowwouldpro@gmail.com\n"




    }

    }



