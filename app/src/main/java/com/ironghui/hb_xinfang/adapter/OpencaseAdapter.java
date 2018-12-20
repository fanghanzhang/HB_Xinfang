package com.ironghui.hb_xinfang.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ironghui.hb_xinfang.R;
import com.ironghui.hb_xinfang.activity.OpcaseXqActivity;
import com.ironghui.hb_xinfang.bean.OpenUser;
import com.ironghui.hb_xinfang.fragment.OpenCaseFragment;

import java.util.ArrayList;

public class OpencaseAdapter extends RecyclerView.Adapter<OpencaseAdapter.OpenCaseViewHolder> {
    private Context mContext;
    private ArrayList<OpenUser> mArraylist;

    public OpencaseAdapter(Context context, ArrayList<OpenUser> arraylist) {
        this.mArraylist = arraylist;
        this.mContext = context;
    }

    @Override
    public OpencaseAdapter.OpenCaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.item_opencase, null);
        OpenCaseViewHolder viewHolder = new OpenCaseViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final OpencaseAdapter.OpenCaseViewHolder holder, final int position) {
        holder.opencase_time.setText(mArraylist.get(position).getTime());
        holder.opencase_title.setText(mArraylist.get(position).getTitle());
        holder.opnecase_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, OpcaseXqActivity.class);
                intent.putExtra("mArraylist",mArraylist.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArraylist.size();
    }

    class OpenCaseViewHolder extends RecyclerView.ViewHolder {

        private TextView opencase_title;
        private TextView opencase_time;
        private  LinearLayout opnecase_ll;

        public OpenCaseViewHolder(View itemView) {
            super(itemView);
            opencase_title = itemView.findViewById(R.id.opencase_title);
            opencase_time = itemView.findViewById(R.id.opencase_time);
            opnecase_ll = itemView.findViewById(R.id.opnecase_ll);
        }
    }
}
