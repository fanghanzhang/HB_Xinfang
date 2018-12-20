package com.ironghui.hb_xinfang.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ironghui.hb_xinfang.R;

public class PingjiaActivity extends BaseActivity implements View.OnClickListener {

    private ImageView top_title_iv;
    private TextView top_title_tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pingjia);
        initview();
        initClicklistener();
    }

    private void initClicklistener() {
        top_title_iv.setOnClickListener(this);
    }

    private void initview() {
        top_title_iv = findViewById(R.id.top_title_iv);
        top_title_tv = findViewById(R.id.top_title_tv);
        top_title_iv.setImageResource(R.drawable.top_left);
        top_title_tv.setText("我要评价");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_title_iv:
                finish();
                break;
        }
    }
}
