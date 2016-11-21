package com.braulio.mvp_realm_kata.activity;

import android.os.Bundle;

import com.braulio.mvp_realm_kata.R;
import com.braulio.mvp_realm_kata.common.BaseActivity;

public class ContactActivity extends BaseActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override protected int setLayout() { return R.id.activity_contact; }
}
