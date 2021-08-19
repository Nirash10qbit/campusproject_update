package com.example.you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    String st,st0,st1,st2,st3,st4,st5,st6,st16,st20;
    TextView tv,tv0,tv1,tv2,tv3,tv4,tv5,tv6,tv16,tv20;

    String st21 = "P7rU-Af-Q-Q";

    private YouTubePlayerView youtube_play;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    private static final String DEVELOPER_KEY="AIzaSyCze7etyfwbsorwWh8fuzbSCcoQ41OT6Ws";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.ltext5);
        st = getIntent().getExtras().getString("value");
        tv.setText(st);
        tv1 = findViewById(R.id.ltext6);
        st1= getIntent().getExtras().getString("gid");
        tv1.setText(st1);
        tv2 = findViewById(R.id.ltext7);
        st2 = getIntent().getExtras().getString("SIDNAME");
        tv2.setText(st2);
        tv3 = findViewById(R.id.ltext8);
        st3 = getIntent().getExtras().getString("SID");
        tv3.setText(st3);
        tv4 = findViewById(R.id.ltext9);
        st4 = getIntent().getExtras().getString("CIDNAME");
        tv4.setText(st4);
        tv5 = findViewById(R.id.ltext10);
        st5 = getIntent().getExtras().getString("CID");
        tv5.setText(st5);
        tv6 = findViewById(R.id.ltext11);
        st6 = getIntent().getExtras().getString("CPDF");
        tv6.setText(st6);
        tv0 = findViewById(R.id.ltext12);
        st0 = getIntent().getExtras().getString("SIDPDF");
        tv0.setText(st0);
        tv16 = findViewById(R.id.ltext16);
        st16 = getIntent().getExtras().getString("cact");
        tv16.setText(st16);
        tv20 = findViewById(R.id.ltext20);
        st20 = getIntent().getExtras().getString("cvideo");
        tv20.setText(st20);

        youtube_play = findViewById(R.id.youtube_play);

        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo(st21);

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        youtube_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youtube_play.initialize(DEVELOPER_KEY,onInitializedListener);
            }
        });


    }
    public void backvvppage(View view){
        Intent intent = new Intent (this, vpage.class);
        intent.putExtra("value",st);
        intent.putExtra("gid",st1);
        intent.putExtra("SID",st3);
        intent.putExtra("SIDNAME",st2);
        intent.putExtra("SIDPDF",st0);
        intent.putExtra("CIDNAME",st4);
        intent.putExtra("CID",st5);
        intent.putExtra("CPDF",st6);
        intent.putExtra("cact",st16);
        intent.putExtra("cvideo",st20);
        startActivity (intent);

    }


}