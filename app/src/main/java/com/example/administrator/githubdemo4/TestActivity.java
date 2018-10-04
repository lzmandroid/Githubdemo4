package com.example.administrator.githubdemo4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator  on 2018/9/27
 */
public class TestActivity extends Activity {
    private String aa;
    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aa="ssss";

    }
}
