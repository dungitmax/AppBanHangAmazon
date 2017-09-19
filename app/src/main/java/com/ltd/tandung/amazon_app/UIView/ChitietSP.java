package com.ltd.tandung.amazon_app.UIView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.ltd.tandung.amazon_app.R;

public class ChitietSP extends AppCompatActivity {


    TextView tvKey1;
    TextView tvKey2;
    TextView tvKey3;
    TextView tvKey4;
    TextView tvKey5;
    TextView tvKey6;

    TextView tvValue1;
    TextView tvValue2;
    TextView tvValue3;
    TextView tvValue4;
    TextView tvValue5;
    TextView tvValue6;
    ScrollView scrvImage, scrvSp;
    Button btnThem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet_sp);
        addControls();
        addEvents();
    }

    private void addEvents() {

        try {

        } catch (Exception ex) {
            Intent intent = new Intent(ChitietSP.this, GioHang.class);
            startActivity(intent);
            ChitietSP.this.finish();

        }

    }

    private void addControls() {
        tvKey1 = (TextView) findViewById(R.id.tvKey1);
        tvKey2 = (TextView) findViewById(R.id.tvKey2);
        tvKey3 = (TextView) findViewById(R.id.tvKey3);
        tvKey4 = (TextView) findViewById(R.id.tvKey4);
        tvKey5 = (TextView) findViewById(R.id.tvKey5);
        tvKey6 = (TextView) findViewById(R.id.tvKey6);

        tvValue1 = (TextView) findViewById(R.id.tvValue1);
        tvValue2 = (TextView) findViewById(R.id.tvValue2);
        tvValue3 = (TextView) findViewById(R.id.tvValue3);
        tvValue4 = (TextView) findViewById(R.id.tvValue4);
        tvValue5 = (TextView) findViewById(R.id.tvValue5);
        tvValue6 = (TextView) findViewById(R.id.tvValue6);
        scrvImage = (ScrollView) findViewById(R.id.scrvImage);
        scrvSp = (ScrollView) findViewById(R.id.scrvSp);
        btnThem = (Button) findViewById(R.id.btnThem);


    }


}
