package com.example.mrlinh.doan;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MrLinh on 9/12/2017.
 */

public class TableViewAdapter extends ArrayAdapter {

    Context context;
    String [] value,key,loop;
    public TableViewAdapter(@NonNull Context context, String[] key,String[] value, @NonNull String[] loop) {
        super(context, R.layout.activity_chi_tiet__sp, loop);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;


        if (row == null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.activity_chi_tiet__sp,parent,false);
        }
        TableLayout tableLayout = (TableLayout) row.findViewById(R.id.tblChiTietSp);
        for (int i=0;i<5;i++) {
            TableRow tableRow = new TableRow(context);

            tableRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            TextView tvKey = new TextView(context);
            tvKey.setText(key[(position * 5) + i]);
            tvKey.setTextColor(Color.WHITE);
            tvKey.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
            tableRow.addView(tvKey);

            TextView tvValue = new TextView(context);
            tvValue.setText(value[(position * 5) + i]);
            tvValue.setTextColor(Color.WHITE);
            tvValue.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
            tableRow.addView(tvValue);
            tableLayout.addView(tableRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


        }

        return row;

    }
}
