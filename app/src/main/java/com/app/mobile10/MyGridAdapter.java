package com.app.mobile10;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGridAdapter extends BaseAdapter {
    Context context; //액티비티를 값이 들어갈 객체!

    MyGridAdapter(Context context1){
        context = context1;
    }
    int[] posterID = {
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,  R.drawable.mov04,  R.drawable.mov05,
            R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09
    };
    @Override
    public int getCount() {
        return posterID.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    //gridView에 들어갈 하나하나의 layout을 만들어주는 메서드!
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //gridView에 들어갈 이미지뷰 객체를 만들어주어야 한다.
//        ImageView imageView = new ImageView(context);
//        imageView.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
//        imageView.setPadding(5, 5, 5, 5);
        // Button button = new Button(context);
//        imageView.setImageResource(posterID[i]);
//        return imageView;
        //버튼
//        Button button = new Button(context);
//        button.setLayoutParams(new ViewGroup.LayoutParams(300,300));
//        button.setPadding(5,5,5,5);
//        button.setText("내가 반복"+i);
//        return button;
        //텍스트뷰를 반복
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        textView.setPadding(5,5,5,5);
        textView.setText("텍스트 반복"+i);
        return textView;
    }
//기본 어탭터의 기능들을 내가 임의로 재정의해서 사용가능하다.


}