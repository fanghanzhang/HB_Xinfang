package com.ironghui.hb_xinfang.activity;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.ironghui.hb_xinfang.R;
import com.ironghui.hb_xinfang.application.MyApplication;
import com.ironghui.hb_xinfang.fragment.HomeFragment;
import com.ironghui.hb_xinfang.fragment.OpenCaseFragment;
import com.ironghui.hb_xinfang.fragment.XingfangOrgFragment;
import com.ironghui.hb_xinfang.fragment.XingfangZhiNanFragment;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private HomeFragment homeFragment;
    private FrameLayout fl;
    private LinearLayout home_button_ll, oppen_button_ll, xinfang_br_ll, xinfang_zhinan_ll;
    private OpenCaseFragment openCaseFragment;
    private XingfangOrgFragment xingfangOrgFragment;
    private XingfangZhiNanFragment xingfangZhiNanFragment;
    private ImageView topTitleIv;
    private TextView top_title_tv;
    private TextView xinfang_zhinantextview;
    private TextView open_textview, xinfang_textview, home_textview;
    private ImageView home_button;
    private ImageView oppen_button;
    private ImageView xinfang_br;
    private ImageView xinfang_zhinan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        intView();
        setSelect(0);
        initClickListener();
        fullScreen(this);
        requetsPermition();

    }


    private void requetsPermition() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 0);
        }
    }

    private void fullScreen(Activity activity) {
        ViewGroup contentFrameLayout = (ViewGroup) activity.findViewById(android.R.id.content);
        View parentView = contentFrameLayout.getChildAt(0);
        if (parentView != null && Build.VERSION.SDK_INT >= 14) {
            //布局预留状态栏高度的 padding
            parentView.setFitsSystemWindows(true);
            if (parentView instanceof DrawerLayout) {
                DrawerLayout drawer = (DrawerLayout) parentView;
                //将主页面顶部延伸至status bar;虽默认为false,但经测试,DrawerLayout需显示设置
                drawer.setClipToPadding(false);
            }
        }

    }


    private void initClickListener() {
        home_button_ll.setOnClickListener(this);
        oppen_button_ll.setOnClickListener(this);
        xinfang_br_ll.setOnClickListener(this);
        xinfang_zhinan_ll.setOnClickListener(this);
    }

    private void intView() {
        fl = findViewById(R.id.rl);
        home_button_ll = findViewById(R.id.home_button_ll);
        oppen_button_ll = findViewById(R.id.oppen_button_ll);
        xinfang_br_ll = findViewById(R.id.xinfang_br_ll);
        xinfang_zhinan_ll = findViewById(R.id.xinfang_zhinan_ll);
        topTitleIv = findViewById(R.id.top_title_iv);
        top_title_tv = findViewById(R.id.top_title_tv);
        xinfang_zhinantextview = findViewById(R.id.xinfang_zhinantextview);
        xinfang_textview = findViewById(R.id.xinfang_textview);
        home_textview = findViewById(R.id.home_textview);
        open_textview = findViewById(R.id.open_textview);
        home_button = findViewById(R.id.home_button);
        oppen_button = findViewById(R.id.oppen_button);
        xinfang_br = findViewById(R.id.xinfang_br);
        xinfang_zhinan = findViewById(R.id.xinfang_zhinan);
        String url = "http://wsxf.hbzw.gov.cn:8001/trilink/app_Letter_queryLetter_n.action?queryCode=4215020817321502&name=饶仲安";
        String urlgk = "http://wsxf.hbzw.gov.cn:8001/trilink/app_AppOpenLetter_queryOpenLetterList_n.action?pageNo=0&pageSize=10";//案例公开
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String jsonObject) {
                Log.i("jsonobject", jsonObject.toString());
                Gson gson = new Gson();
                try {
                    JSONObject jsonObject1 = new JSONObject(jsonObject);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Object openCaseBean = gson.fromJson(jsonObject, Object.class);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.i("jsonobjecterr", volleyError.toString());
            }
        });
        request.addMarker("查询tag");
        MyApplication.getHttpQueues().add(request);
    }

    public void setSelect(int i) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        switch (i) {
            case 0:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.rl, homeFragment);
                } else {
                    fragmentTransaction.show(homeFragment);
                }
                home_textview.setTextColor(0xff0d58aa);
                home_button.setImageResource(R.drawable.ic_syblue);
                break;
            case 1:
                if (openCaseFragment == null) {
                    openCaseFragment = new OpenCaseFragment();
                    fragmentTransaction.add(R.id.rl, openCaseFragment);
                } else {
                    fragmentTransaction.show(openCaseFragment);
                }
                top_title_tv.setText("案例公开");
                topTitleIv.setImageResource(R.drawable.top_left);
                open_textview.setTextColor(0xff0d58aa);
                oppen_button.setImageResource(R.drawable.ic_algkblue);
                break;
            case 2:
                if (xingfangOrgFragment == null) {
                    xingfangOrgFragment = new XingfangOrgFragment();
                    fragmentTransaction.add(R.id.rl, xingfangOrgFragment);
                } else {
                    fragmentTransaction.show(xingfangOrgFragment);
                }
                top_title_tv.setText("信访机构");
                topTitleIv.setImageResource(R.drawable.top_left);
                xinfang_textview.setTextColor(0xff0d58aa);
                xinfang_br.setImageResource(R.drawable.ic_xfjgblue);
                break;
            case 3:
                if (xingfangZhiNanFragment == null) {
                    xingfangZhiNanFragment = new XingfangZhiNanFragment();
                    fragmentTransaction.add(R.id.rl, xingfangZhiNanFragment);
                } else {
                    fragmentTransaction.show(xingfangZhiNanFragment);
                }
                top_title_tv.setText("信访指南");
                topTitleIv.setImageResource(R.drawable.top_left);
                xinfang_zhinantextview.setTextColor(0xff0d58aa);
                xinfang_zhinan.setImageResource(R.drawable.ic_xfznblue);
                break;
            default:
                break;
        }
        fragmentTransaction.commit();
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if (homeFragment != null) {
            fragmentTransaction.hide(homeFragment);
        }
        if (openCaseFragment != null) {
            fragmentTransaction.hide(openCaseFragment);
        }
        if (xingfangOrgFragment != null) {
            fragmentTransaction.hide(xingfangOrgFragment);
        }
        if (xingfangZhiNanFragment != null) {
            fragmentTransaction.hide(xingfangZhiNanFragment);
        }
    }

    @Override
    public void onClick(View v) {
        resetResource();
        switch (v.getId()) {
            case R.id.home_button_ll:
                setSelect(0);
                break;
            case R.id.oppen_button_ll:
                setSelect(1);
                break;
            case R.id.xinfang_br_ll:
                setSelect(2);
                break;
            case R.id.xinfang_zhinan_ll:
                setSelect(3);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.getHttpQueues().cancelAll("查询tag");
    }

    private void resetResource() {
        home_button.setImageResource(R.drawable.ic_sygray);
        oppen_button.setImageResource(R.drawable.ic_algkgray);
        xinfang_br.setImageResource(R.drawable.ic_xfjggray);
        xinfang_zhinan.setImageResource(R.drawable.ic_xfzngray);
        home_textview.setTextColor(0xff959595);
        open_textview.setTextColor(0xff959595);
        xinfang_textview.setTextColor(0xff959595);
        xinfang_zhinantextview.setTextColor(0xff959595);
    }
}
