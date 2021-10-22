package com.app.mobile10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        //어디에 분리시켜놓은 layout파일을 넣을지 결정!
        LinearLayout layout1 = findViewById(R.id.tabSong);
        LinearLayout layout2 = findViewById(R.id.tabArtist);
        LinearLayout layout3 = findViewById(R.id.tabAlbum);

        //분리시켜놓은 xml파일(layout)들을 객체화 시키자.
        //inflation
        View songView = View.inflate(TabActivity.this, R.layout.song, null);
        View artView = View.inflate(TabActivity.this, R.layout.art, null);
        View albumView = View.inflate(TabActivity.this, R.layout.album, null);

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup(); //기초적인 tab초기화!

        layout1.addView(songView);
        layout2.addView(artView);
        layout3.addView(albumView);

        ImageView imageView = songView.findViewById(R.id.imageView);
        Button btnChange = songView.findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.star);
            }
        });

        ImageView imageView2 = artView.findViewById(R.id.imageView2);
        TextView text4 = artView.findViewById(R.id.text4);
        Button btnChange2 = artView.findViewById(R.id.btnChange2);
        btnChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(R.drawable.star);
                text4.setText("이미지 바뀜");
            }
        });

        //각 탭마다의 설정을 넣음.
        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.tabSong);//layout를 끼워넣음
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpecArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);

    }
}