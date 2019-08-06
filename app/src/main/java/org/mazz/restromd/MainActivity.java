package org.mazz.restromd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import org.mazz.restromd.Adapter.DashboardAdapter;
import org.mazz.restromd.Event.DashboardEvent;
import org.mazz.restromd.Modal.DashboardModal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView dashboardGridView;
    ArrayList<DashboardModal> dashboardList=new ArrayList<DashboardModal>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DashboardModal dm=new DashboardModal("HMS",R.drawable.hms);
        DashboardModal dm1=new DashboardModal("POS",R.drawable.pos);
        dashboardList.add(dm);
        dashboardList.add(dm1);

        dashboardGridView = (GridView) findViewById(R.id.dashboard_grid);
        dashboardGridView.setAdapter(new DashboardAdapter(this,dashboardList));
        DashboardEvent.dashboardItemClick(this,dashboardGridView);

    }
}
