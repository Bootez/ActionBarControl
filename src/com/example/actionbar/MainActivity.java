package com.example.actionbar;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
    private ActionBar mActionBar;
    private Button hideButton;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActionBar = getActionBar();
        
        hideButton = (Button)findViewById(R.id.btn_hide);
        hideButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                mActionBar.hide();
            }
        });
        
        showButton = (Button)findViewById(R.id.btn_show);
        showButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                mActionBar.show();
            }
        });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
