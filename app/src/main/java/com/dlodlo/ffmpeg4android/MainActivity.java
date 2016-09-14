package com.dlodlo.ffmpeg4android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        FFmpegNative ffmpeg = new FFmpegNative();
        int codecID = 28;

        int res = ffmpeg.avcodec_find_decoder(codecID);

        if (res ==0) {
            tv.setText("Success!");
        }
        else {
            tv.setText("Failed!");
        }

    }
}
