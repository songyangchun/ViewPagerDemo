package com.example.cindy.viewpagerdemo.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.cindy.viewpagerdemo.R;
import com.example.cindy.viewpagerdemo.Utils.StatusBarUtil;

import crossoverone.statuslib.StatusUtil;

public class MyFragment1 extends Fragment {

    public MyFragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment1, container, false);
        return view;
    }
}

