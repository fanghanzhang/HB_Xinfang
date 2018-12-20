package com.ironghui.hb_xinfang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ironghui.hb_xinfang.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class XingfangZhiNanFragment extends Fragment {
    @BindView(R.id.fragment_zhinan_tv)
    TextView fragmentZhinanTv;
    Unbinder unbinder;

    public static XingfangZhiNanFragment newInstance(String title) {
        XingfangZhiNanFragment homeFragment = new XingfangZhiNanFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        homeFragment.setArguments(bundle);
        return homeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xingfangzhinan, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        fragmentZhinanTv.setText("");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
