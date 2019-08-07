package org.mazz.restromd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import org.mazz.restromd.Service.SessionManagerService;

import java.util.HashMap;

public class LoginActivity extends AppCompatActivity {

    SessionManagerService session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        session = new SessionManagerService(this);
        session.setRestApiUrlSession("http://192.168.1.120:8090/");


    }


    public void loginEvent(View view)
    {
        Intent myIntent = new Intent(this,
                SideMenuActivity.class);
        startActivity(myIntent);
    }

}
