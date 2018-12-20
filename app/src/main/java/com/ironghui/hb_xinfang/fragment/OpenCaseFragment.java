package com.ironghui.hb_xinfang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ironghui.hb_xinfang.R;
import com.ironghui.hb_xinfang.adapter.OpencaseAdapter;
import com.ironghui.hb_xinfang.application.MyApplication;
import com.ironghui.hb_xinfang.bean.OpenUser;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class OpenCaseFragment extends Fragment {


    @BindView(R.id.rcy)
    RecyclerView rcy;
    Unbinder unbinder;
    private ArrayList<OpenUser> arrayList;

    public static OpenCaseFragment newInstance(String title) {
        OpenCaseFragment homeFragment = new OpenCaseFragment();
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
        View view = inflater.inflate(R.layout.fragment_opencase, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getData();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcy.setLayoutManager(linearLayoutManager);
        OpencaseAdapter adapter = new OpencaseAdapter(getActivity(), arrayList);
        rcy.setAdapter(adapter);
    }

    private void getData() {
        arrayList = new ArrayList<>();
        arrayList.add(new OpenUser("王麻子找隔壁老王", "2018-12-12 8:02:12"));
        arrayList.add(new OpenUser("曾荫权发送想得开", "2018-12-13 8:02:12"));
        arrayList.add(new OpenUser("卢作孚情操", "2018-12-14 8:02:12"));
        arrayList.add(new OpenUser("张之洞坐京汉铁路", "2018-12-15 8:02:12"));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        MyApplication.getHttpQueues().cancelAll("anlitag");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
