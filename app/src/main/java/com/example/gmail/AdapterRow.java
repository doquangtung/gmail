package com.example.gmail;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterRow extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Row> arr;

    public AdapterRow(Context context, int layout, List<Row> arr) {
        this.context = context;
        this.layout = layout;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater l_inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = l_inf.inflate(layout, null);
        Row row = arr.get(position);

        TextView icon = (TextView) convertView.findViewById(R.id.my_icon);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView body = (TextView) convertView.findViewById(R.id.body);

        title.setText(row.getTitle());
        body.setText(row.getBody());
        icon.setText(String.valueOf(title.getText().toString().charAt(0)));

        return convertView;

    }
}
