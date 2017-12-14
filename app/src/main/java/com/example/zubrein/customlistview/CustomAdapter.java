package com.example.zubrein.customlistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Zubrein on 6/11/2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    String[] country;
    String[] codes;
    int[] flag;
    Context ctx;

    public CustomAdapter(Context context, String[] country, String[] code , int[] flag ) {
        super(context, R.layout.item);
        this.country = country;
        this.codes = code;
        this.flag = flag;
        this.ctx = context;
    }

    @Override
    public int getCount() {
        return country.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = new ViewHolder();
        if(convertView == null) {
            LayoutInflater inflate = (LayoutInflater)
                    ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflate.inflate(R.layout.item, parent, false);

            holder.flag = (ImageView) convertView.findViewById(R.id.img);
            holder.country = (TextView) convertView.findViewById(R.id.name);
            holder.codes = (TextView) convertView.findViewById(R.id.code);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.flag.setImageResource(flag[position]);
        holder.country.setText(country[position]);
        holder.codes.setText(codes[position]);

        return convertView;
    }

    static class ViewHolder{
        ImageView flag;
        TextView country;
        TextView codes;
    }
}
