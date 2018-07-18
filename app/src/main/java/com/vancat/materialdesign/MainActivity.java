package com.vancat.materialdesign;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.vancat.materialdesign.fragment.EditTextFragment;
import com.vancat.materialdesign.fragment.MenusFragment;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //悬浮按钮
        fragment = new MenusFragment();

        //编辑框
        fragment = new EditTextFragment();





        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment, fragment).commit();
        }

    }
}
