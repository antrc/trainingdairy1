package com.gmail.antrcone.trainingdairy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mList;
    private LayoutInflater mLayoutInflater;

    public ListAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        if (mList != null) {
            return mList.size();
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int i) {
        if (mList != null) {
            return mList.get(i);
        } else {
            return null;
        }
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.listitem, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) view.findViewById(R.id.listitemtext);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textView.setText(mList.get(i));
        return view;
    }

    private static class ViewHolder {
        private TextView textView;

    }
}