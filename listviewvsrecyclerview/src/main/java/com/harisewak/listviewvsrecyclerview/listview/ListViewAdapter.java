package com.harisewak.listviewvsrecyclerview.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.harisewak.listviewvsrecyclerview.R;
import com.harisewak.listviewvsrecyclerview.other.ListItem;

import java.util.ArrayList;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<ListItem> listData;
    private LayoutInflater layoutInflater;

    public ListViewAdapter(Context aContext, ArrayList<ListItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View v, ViewGroup vg) {
        ViewHolder holder;
        if (v == null) {
            v = layoutInflater.inflate(R.layout.item_list, vg, false);
            holder = new ViewHolder();
            holder.uName = (TextView) v.findViewById(R.id.name);
            holder.uDesignation = (TextView) v.findViewById(R.id.designation);
            holder.uLocation = (TextView) v.findViewById(R.id.location);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        ListItem item = listData.get(position);
        holder.uName.setText(String.format(
                Locale.ENGLISH,
                "%d. %s",
                item.getId(),
                item.getName()));
        holder.uDesignation.setText(item.getDesignation());
        holder.uLocation.setText(item.getLocation());
        return v;
    }

    static class ViewHolder {
        TextView uName;
        TextView uDesignation;
        TextView uLocation;
    }
}
