package org.mazz.restromd;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;

import org.mazz.restromd.Adapter.DashboardAdapter;
import org.mazz.restromd.Event.DashboardEvent;
import org.mazz.restromd.Modal.DashboardModal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    GridView dashboardGridView;
    ArrayList<DashboardModal> dashboardList = new ArrayList<DashboardModal>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DashboardModal dm = new DashboardModal("HMS", R.drawable.hms);
        DashboardModal dm1 = new DashboardModal("POS", R.drawable.pos);
        dashboardList.add(dm);
        dashboardList.add(dm1);

        dashboardGridView = (GridView) findViewById(R.id.dashboard_grid);




        //We change the color to RED for the first time as the program loads
      //  dashboardGridView.setBackgroundColor(Color.RED);


        //Create the timer object which will run the desired operation on a schedule or at a given time
//        Timer timer = new Timer();
//
//        //Create a task which the timer will execute.  This should be an implementation of the TimerTask interface.
//        //I have created an inner class below which fits the bill.
//        MyTimer mt = new MyTimer();
//
//        //We schedule the timer task to run after 1000 ms and continue to run every 1000 ms.
//        timer.schedule(mt, 1000, 1000);

        dashboardGridView.setAdapter(new DashboardAdapter(this, dashboardList));
        DashboardEvent.dashboardItemClick(this, dashboardGridView);

    }

    class MyTimer extends TimerTask {

        public void run() {

            //This runs in a background thread.
            //We cannot call the UI from this thread, so we must call the main UI thread and pass a runnable
            runOnUiThread(new Runnable() {

                public void run() {
                    Random rand = new Random();
                    //The random generator creates values between [0,256) for use as RGB values used below to create a random color
                    //We call the RelativeLayout object and we change the color.  The first parameter in argb() is the alpha.
                    dashboardGridView.setBackgroundColor(Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                }
            });
        }
    }
}
