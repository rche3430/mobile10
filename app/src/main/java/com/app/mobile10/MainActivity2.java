package com.app.mobile10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            TabHost tabHost = findViewById(R.id.tabhost);
            tabHost.setup();

            TabHost.TabSpec tabSpecHome = tabHost.newTabSpec("홈").setIndicator("홈 화면");
            tabSpecHome.setContent(R.id.tabHome);
            tabHost.addTab(tabSpecHome);

            TabHost.TabSpec tabSpecCategory = tabHost.newTabSpec("카테고리").setIndicator("카테고리 화면");
            tabSpecCategory.setContent(R.id.tabCategory);
            tabHost.addTab(tabSpecCategory);

            TabHost.TabSpec tabSpecGift = tabHost.newTabSpec("선물함").setIndicator("선물함 화면");
            tabSpecGift.setContent(R.id.tabGift);
            tabHost.addTab(tabSpecGift);

            tabHost.setCurrentTab(0);
    }
}