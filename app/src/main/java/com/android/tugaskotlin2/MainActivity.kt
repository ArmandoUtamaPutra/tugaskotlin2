package com.android.tugaskotlin2

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        fb.setOnClickListener {
            val fb = Intent(android.content.Intent.ACTION_VIEW)
            fb.data= Uri.parse("https://id-id.facebook.com/")
            startActivity(fb)
        }
        ig.setOnClickListener {
            val ig = Intent(android.content.Intent.ACTION_VIEW)
            ig.data= Uri.parse("https://www.instagram.com/armandoputra77")
            startActivity(ig)
        }
        tw.setOnClickListener {
            val tw = Intent(android.content.Intent.ACTION_VIEW)
            tw.data= Uri.parse("https://twitter.com/login?lang=id")
            startActivity(tw)
        }
        gh.setOnClickListener {
            val gh = Intent(android.content.Intent.ACTION_VIEW)
            gh.data= Uri.parse("https://github.com/armandoutamaputra")
            startActivity(gh)
        }



    }
}
