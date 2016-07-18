package com.example.huang.exercise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Date: 16-7-18.
 * Email: yifan.huang@renren-inc.com
 */
public class Exercise extends Activity implements View.OnClickListener {

    private LinearLayout llSource;
    private LinearLayout llTags;
    private ImageView imageDetail;
    private View vDetail;
    private boolean isShow = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.exercise);

        init();
        bindListen();
        super.onCreate(savedInstanceState);
    }

    private void bindListen() {
        //vDetail.setOnClickListener(this);
        imageDetail.setOnClickListener(this);
    }

    private void init() {
        llSource = (LinearLayout)findViewById(R.id.ll_source);
        llTags = (LinearLayout)findViewById(R.id.ll_tags);
        imageDetail = (ImageView) findViewById(R.id.image_detail);

        //vDetail = findViewById(R.id.v_detail);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_detail:
                if (!isShow) {
                    llSource.setVisibility(View.VISIBLE);
                    llTags.setVisibility(View.VISIBLE);
                    imageDetail.setImageResource(R.drawable.sort_pop_arrow_down);
                    isShow = true;
                }else if (isShow){
                    llSource.setVisibility(View.GONE);
                    llTags.setVisibility(View.GONE);
                    imageDetail.setImageResource(R.drawable.sort_pop_arrow_up);
                    isShow = false;
                }
                break;

        }

    }
}
