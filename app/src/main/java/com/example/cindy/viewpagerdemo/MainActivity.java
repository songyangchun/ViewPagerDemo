package com.example.cindy.viewpagerdemo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.example.cindy.viewpagerdemo.Fragment.Adapter.MyFragmentPagerAdapter;
import com.example.cindy.viewpagerdemo.Fragment.MyFragment1;
import com.example.cindy.viewpagerdemo.Fragment.MyFragment2;
import com.example.cindy.viewpagerdemo.Fragment.MyFragment3;
import com.example.cindy.viewpagerdemo.Fragment.MyFragment4;
import com.example.cindy.viewpagerdemo.Utils.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindArray;
import butterknife.BindView;
import crossoverone.statuslib.StatusUtil;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener{

    @BindView(R.id.rg_tab_bar)
    RadioGroup rg_tab_bar;

    //UI Objects


    private RadioButton rb_channel;
    private RadioButton rb_message;
    private RadioButton rb_better;
    private RadioButton rb_setting;
    private ViewPager vpager;



    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    private MyFragmentPagerAdapter mAdapter;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindViews();
        rb_channel.setChecked(true);



    }
    //UI组件初始化与事件绑定
    private void bindViews() {


        rb_channel = (RadioButton) findViewById(R.id.rb_channel);
        rb_message = (RadioButton) findViewById(R.id.rb_message);
        rb_better = (RadioButton) findViewById(R.id.rb_better);
        rb_setting = (RadioButton) findViewById(R.id.rb_setting);
        rg_tab_bar.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) this);

        vpager = (ViewPager) findViewById(R.id.vpager);

        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);  //初始设置ViewPager选中第一帧
        vpager.addOnPageChangeListener(this);


        vpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        StatusBarUtil.setRootViewFitsSystemWindows(MainActivity.this,true);
                        StatusBarUtil.setStatusBarColor(MainActivity.this,0xffffc800);
                    break;
                    case 1:
                        StatusBarUtil.setTranslucentStatus(MainActivity.this);//设置状态栏透明
                    break;
                    case 2:
                    case 3:
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }




    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_channel:
                vpager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_message:
                vpager.setCurrentItem(PAGE_TWO);
                break;
            case R.id.rb_better:
                vpager.setCurrentItem(PAGE_THREE);
                break;
            case R.id.rb_setting:
                vpager.setCurrentItem(PAGE_FOUR);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        /*此方法在页面被选中时调用*/

    }






    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case PAGE_ONE:
                    rb_channel.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_message.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_better.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_setting.setChecked(true);
                    break;
            }
        }
    }




}
