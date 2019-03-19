package com.uroad.viewtest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MultistageProgress progress;
    public   int DEF_COLORS[];//默认背景颜色数组
    public   float DEF_WEIGHTS[];//每段对应的权重
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            DEF_COLORS = new int[]{
                    Color.parseColor("#FFD700"),
                    Color.parseColor("#FF00FF"),
                    Color.parseColor("#080808"),
                    Color.parseColor("#FFFFFF"),
                    Color.parseColor("#FF0000")
            };
            DEF_WEIGHTS = new float[]{18, 35, 30, 23, 57};

//        progress = findViewById(R.id.progress);
        progress = new MultistageProgress(this,DEF_COLORS,DEF_WEIGHTS);
        setContentView(R.layout.activity_main);
    }
}
