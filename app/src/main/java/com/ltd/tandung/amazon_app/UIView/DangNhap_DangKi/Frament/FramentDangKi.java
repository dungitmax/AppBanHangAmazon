package com.ltd.tandung.amazon_app.UIView.DangNhap_DangKi.Frament;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ltd.tandung.amazon_app.R;

/**
 * Created by letandung on 09/09/2017.
 */

public class FramentDangKi extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dangki, container, false);
        return view;
    }
}
