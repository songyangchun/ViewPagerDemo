package com.example.cindy.viewpagerdemo.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cindy.viewpagerdemo.R;
import com.example.cindy.viewpagerdemo.Utils.StatusBarUtil;

import crossoverone.statuslib.StatusUtil;

public class MyFragment2 extends Fragment {

    public MyFragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment2, container, false);
        return view;

    }



}

