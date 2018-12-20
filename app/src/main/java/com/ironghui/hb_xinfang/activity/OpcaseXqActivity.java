package com.ironghui.hb_xinfang.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ironghui.hb_xinfang.R;
import com.ironghui.hb_xinfang.bean.OpenUser;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OpcaseXqActivity extends BaseActivity implements View.OnClickListener{
    @BindView(R.id.opencase_xq_title)
    TextView opencaseXqTitle;
    @BindView(R.id.opencase_xq_time)
    TextView opencaseXqTime;
    @BindView(R.id.top_title_iv)
    ImageView topTitleIv;
    @BindView(R.id.top_title_tv)
    TextView topTitleTv;
    private OpenUser openUser;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opencase);
        ButterKnife.bind(this);
        openUser = (OpenUser) getIntent().getSerializableExtra("mArraylist");
        initView();
        bindOnclickListener();
    }

    private void bindOnclickListener() {
        topTitleIv.setOnClickListener(this);
    }

    private void initView() {
        topTitleIv.setImageResource(R.drawable.top_left);
        topTitleTv.setText("案例公开");
        opencaseXqTime.setText(openUser.getTime());
        opencaseXqTitle.setText(openUser.getTitle());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.top_title_iv:
                finish();
                break;
        }
    }
}
