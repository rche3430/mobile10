package com.app.mobile10;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PerfectAdapter extends BaseAdapter {
    Context context; //GridActivity2
    PerfectAdapter(Context c) {//gridActivity2
        context = c;
    }

    int[] posterID = {
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,  R.drawable.mov04,  R.drawable.mov05,
            R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09
    };

    String[] title = {
            "그림1",
            "그림2",
            "그림3",
            "그림4",
            "그림5",
            "그림6",
            "그림7",
            "그림8",
            "그림9",

    };

    @Override
    public int getCount() {return posterID.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    //public View getView(int position, View convertView, ViewGroup parent) {
    public View getView(int index, View view, ViewGroup viewGroup) {
        //반복되는 하나의 View객체를 만들어주어 함.
//        Button button = new Button(context);
//        button.setText("버튼 글자야...");
//        return button;
        View one = View.inflate(context, R.layout.one, null);
        TextView top = one.findViewById(R.id.topText);
        ImageView iv = one.findViewById(R.id.imageView4);
        iv.setImageResource(posterID[index]);
        top.setText(title[index]);
        one.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        one.setPadding(5,5,5,5);
        return one;
    }
}
