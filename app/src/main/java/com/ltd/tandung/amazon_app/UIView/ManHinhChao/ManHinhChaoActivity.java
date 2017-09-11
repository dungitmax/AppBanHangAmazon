package com.ltd.tandung.amazon_app.UIView.ManHinhChao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ltd.tandung.amazon_app.R;
import com.ltd.tandung.amazon_app.UIView.DangNhap_DangKi.DangNhap;

/**
 * Created by letandung on 09/09/2017.
 */

public class ManHinhChaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinhchao);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (Exception ex) {

                } finally {
                    Intent intent = new Intent(ManHinhChaoActivity.this, DangNhap.class);
                    startActivity(intent);
                    ManHinhChaoActivity.this.finish();
                }
            }
        });
        thread.start();

    }
}
