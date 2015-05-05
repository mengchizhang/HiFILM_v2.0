package com.wordpress.hifilmtheapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends Activity {
	VideoView vid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video);
		
		vid = (VideoView)findViewById(R.id.videoview);
		String uripath = "android.resource://" + getPackageName () + "/" + R.raw.demo;
		vid.setVideoURI(Uri.parse(uripath));
		vid.start();
		
		MediaController mc = new MediaController(this);
		mc.setMediaPlayer(vid);
		vid.setMediaController(mc);
	}
	
}
