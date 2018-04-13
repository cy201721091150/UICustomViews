package com.example.a24270.uicustomviews;

/**
 * Created by 24270 on 2018/4/6.
 */

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Steven on 2018/4/6.
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        //动态加载一个title.xml的布局文件，this给TitleLayout布局添加一个父布局
        Button btnTitleBack = (Button)findViewById(R.id.btn_back);
        Button btnTitleEdit = (Button)findViewById(R.id.btn_edit);

        btnTitleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();  //销毁该Activity
            }
        });

        btnTitleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "你好啊", Toast.LENGTH_SHORT).show();
            }
        });
    }
}