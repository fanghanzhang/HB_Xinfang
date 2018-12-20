package com.ironghui.hb_xinfang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ironghui.hb_xinfang.R;
import com.ironghui.hb_xinfang.adapter.MainTabAdapter;
import com.ironghui.hb_xinfang.util.TabUtils;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentLists;
    private String[] tabStrings;

    public static HomeFragment newInstance(String title) {
        HomeFragment homeFragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        homeFragment.setArguments(bundle);
        return homeFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager = view.findViewById(R.id.viewpager);
        tabStrings = new String[]{"我要写信", "我要查询", "我要评价"};
        initView();
    }

    private void initView() {
        fragmentLists = new ArrayList<>();
        DropALetterFragment dropALetterFragment = DropALetterFragment.newInstance("dropALetterFragment");
        QueryFragment queryFragment = QueryFragment.newInstance("queryFragment");
        EvaluateFragment evaluateFragment = EvaluateFragment.newInstance("evaluateFragment");
        fragmentLists.add(dropALetterFragment);
        fragmentLists.add(queryFragment);
        fragmentLists.add(evaluateFragment);
        MainTabAdapter mainTabAdapter = new MainTabAdapter(getActivity().getSupportFragmentManager(), fragmentLists, tabStrings);
        viewPager.setAdapter(mainTabAdapter);
        viewPager.setOffscreenPageLimit(4);
        LinearLayout linearLayout = (LinearLayout) tabLayout.getChildAt(0);
        linearLayout.setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
        linearLayout.setDividerDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.layout_divider_vertical));

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                TabUtils.setIndicator(tabLayout,22,22,0);
            }
        });
    }
}
