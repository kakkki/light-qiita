package com.example.atuski.qiitaqlient.ui.searchhistory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.atuski.qiitaqlient.R;

import java.util.ArrayList;

/**
 * Created by atuski on 2018/04/20.
 */

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.ViewHolder> {

    private LayoutInflater mInflater;
    private ArrayList<String> mData;
    private Context mContext;
//    private OnRecyclerListener mListener;

    public TestRecyclerAdapter(Context context, ArrayList<String> data) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mData = data;
//        mListener = listener;
    }

    @Override
    public TestRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // 表示するレイアウトを設定
        return new ViewHolder(mInflater.inflate(R.layout.search_history_row, viewGroup, false));
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        // データ表示
        if (mData != null && mData.size() > i && mData.get(i) != null) {
            viewHolder.textView.setText(mData.get(i));
        }

        // クリック処理
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mListener.onRecyclerClicked(v, i);
            }
        });

    }

    @Override
    public int getItemCount() {
        if (mData != null) {
            return mData.size();
        } else {
            return 0;
        }
    }

    // ViewHolder(固有ならインナークラスでOK)
    class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
//            textView = (TextView) itemView.findViewById(R.id.list_item_text);
        }
    }

}
