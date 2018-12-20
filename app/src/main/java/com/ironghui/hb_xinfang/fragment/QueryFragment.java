package com.ironghui.hb_xinfang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ironghui.hb_xinfang.R;

public class QueryFragment extends Fragment {
    public static QueryFragment newInstance(String title) {
        QueryFragment queryFragment = new QueryFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        queryFragment.setArguments(args);
        return queryFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chaxun, container, false);
        return view;
    }
}
