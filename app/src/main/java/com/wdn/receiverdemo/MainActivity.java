package com.wdn.receiverdemo;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        performCodeWithPermission("获取向外拨打电话信息", new PermissionCallback() {
            @Override
            public void hasPermission() {

            }

            @Override
            public void noPermission() {

            }
        },Manifest.permission.PROCESS_OUTGOING_CALLS);
    }
}
