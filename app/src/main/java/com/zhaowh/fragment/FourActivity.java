package com.zhaowh.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.zhaowh.fragment.Fragment.ThirdFragment;

public class FourActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private FrameLayout fourFrameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        //此按钮目测现在没用
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        fourFrameLayout = (FrameLayout) findViewById(R.id.four_frame_layout);

        /**
         * Activity中新建一个Fragment
         *并使用Fragment的setArguement()方法传值给Fragment
         *
         */
        Bundle bundle = new Bundle();
        bundle.putString("lemon", "柠檬茶");
        Fragment fragment = new ThirdFragment();
        fragment.setArguments(bundle);
        replaceFragment(fragment);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:

                break;
            default:
                break;
        }
    }

    private void replaceFragment(Fragment ftagment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.four_frame_layout, ftagment);
        transaction.commit();
    }
}
