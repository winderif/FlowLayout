package com.wefika.flowlayout.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by winderif on 2015/7/10.
 */
public class TagAdapter extends BaseAdapter {

    private ArrayList<String> tags;

    private LayoutInflater mLayoutInflater;

    public TagAdapter(Context context) {
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    public TagAdapter(Context context, ArrayList<String> data) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.tags = data;
    }

    private static class ViewHolder {
        public TextView mTextView;
    }

    @Override
    public int getCount() {
        return tags.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View view = convertView;
        final ViewHolder holder;

        if(convertView == null) {
            view = this.mLayoutInflater.inflate(R.layout.item_tag, viewGroup, false);

            holder = new ViewHolder();
            holder.mTextView = (TextView) view.findViewById(R.id.item_tag);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        holder.mTextView.setText(tags.get(position));

        return view;
    }
}
