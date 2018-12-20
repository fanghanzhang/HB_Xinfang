package com.ironghui.hb_xinfang.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ironghui.hb_xinfang.R;
import com.ironghui.hb_xinfang.activity.PingjiaActivity;
import com.ironghui.hb_xinfang.application.MyApplication;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class EvaluateFragment extends Fragment implements View.OnClickListener {
    @BindView(R.id.fangment_xinfang_tv)
    TextView fangmentXinfangTv;
    Unbinder unbinder;
    @BindView(R.id.fragent_evalute_bt)
    Button fragentEvaluteBt;
    private RequestQueue mQueue;

    public static EvaluateFragment newInstance(String title) {
        EvaluateFragment fragment = new EvaluateFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        fragment.setArguments(bundle);
        return fragment;
    }

    public <T> void network(Request<T> request) {

        if (null == mQueue) {
            mQueue = Volley.newRequestQueue(getContext());
        }
        mQueue.add(request);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_evalute, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fangmentXinfangTv.setText("信访人自收到信访事项答复意见书之日起30日内，即可进行\n满意度评价。\n超过三十日未作评价的，视为“超期未评价”。\n" +
                "信访人自提出信访事项之日起超过90日，未收到信访事项\n" +
                "答复意见书的，即可进行满意度评价。\n超过120天未作评价的，视为“超期未评价”。");
        setOnclikListener();
    }

    private void setOnclikListener() {
        fragentEvaluteBt.setOnClickListener(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fragent_evalute_bt:
                Intent intent = new Intent(getContext(), PingjiaActivity.class);
                getActivity().startActivity(intent);
                break;
        }

    }
}
