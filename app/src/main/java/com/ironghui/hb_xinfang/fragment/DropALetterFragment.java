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
import butterknife.OnClick;
import butterknife.Unbinder;

public class DropALetterFragment extends Fragment {
    @BindView(R.id.ragment_dropletter_choosemessage)
    TextView ragmentDropletterChoosemessage;
    Unbinder unbinder;

    public static DropALetterFragment newInstance(String title) {
        DropALetterFragment dropALetterFragment = new DropALetterFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        dropALetterFragment.setArguments(bundle);
        return dropALetterFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fagment_dropleter, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.ragment_dropletter_choosemessage)
    public void onViewClicked(TextView textView) {

    }
}
