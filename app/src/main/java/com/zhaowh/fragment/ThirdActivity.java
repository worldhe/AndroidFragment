package com.zhaowh.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.zhaowh.fragment.Fragment.MainFragment;
import com.zhaowh.fragment.Fragment.SecondFragment;

public class ThirdActivity extends AppCompatActivity {

    private FrameLayout secondFragment;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        secondFragment = (FrameLayout) findViewById(R.id.second_fragment);
        replaceFragment(new MainFragment());
    }

    /**
     * 动态加载新的fragment
     * @param v
     */
    public void addFragment(View v){
        replaceFragment(new SecondFragment());
    }

    public void removeFragment(View view){
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.remove(fragmentManager.findFragmentById(R.id.second_fragment));
        transaction.commit();
    }

    private void replaceFragment(Fragment fragment){
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.second_fragment, fragment);
        transaction.commit();
    }
}
