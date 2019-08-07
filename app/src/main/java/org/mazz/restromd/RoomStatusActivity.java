package org.mazz.restromd;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import org.mazz.restromd.Data.RestApiData;
import org.mazz.restromd.Service.SessionManagerService;

import java.util.HashMap;

public class RoomStatusActivity extends AppCompatActivity {

    GridView roomStatusGridView;
    TextView roomTotalTv;

    SessionManagerService session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_status);
        Toolbar toolbar = (Toolbar) findViewById(R.id.room_status_toolbar);
        roomTotalTv = (TextView) findViewById(R.id.total_room_tv);

        session = new SessionManagerService(getApplicationContext());
        HashMap<String, String> user = session.getRestApiUrl();

        System.out.println("user.."+user);
        // get name
        String restUrl = user.get(SessionManagerService.KEY_REST_API_URL);

        System.out.println("restUrl.."+restUrl);

        toolbar.setTitle("My Toolbar");

        //placing toolbar in place of actionbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        toolbar.setNavigationIcon(R.drawable.ic_back_button); // your drawable
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Implemented by activity
            }
        });


        roomStatusGridView = (GridView) findViewById(R.id.room_status_grid);
        RestApiData.setRoomStatusGrid(this,restUrl,roomStatusGridView,roomTotalTv);

    }

}

