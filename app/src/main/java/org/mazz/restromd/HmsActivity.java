package org.mazz.restromd;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;

import org.mazz.restromd.Adapter.DashboardAdapter;
import org.mazz.restromd.Adapter.HmsDashboardAdapter;
import org.mazz.restromd.Adapter.HmsExpandableListAdapter;
import org.mazz.restromd.Data.RestApiData;
import org.mazz.restromd.Event.DashboardEvent;
import org.mazz.restromd.Modal.DashboardModal;
import org.mazz.restromd.Modal.RoomStatusModal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HmsActivity extends AppCompatActivity {

  //  ExpandableListView expListView;

    GridView hmsDashboardGridView;
    ArrayList<DashboardModal> dashboardList=new ArrayList<DashboardModal>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hms_dashboard);

        DashboardModal dm=new DashboardModal("Room Status",0);
        DashboardModal dm1=new DashboardModal("Today Sale",0);
        DashboardModal dm2=new DashboardModal("Total Sale",0);
        dashboardList.add(dm);
        dashboardList.add(dm1);
        dashboardList.add(dm2);

        hmsDashboardGridView = (GridView) findViewById(R.id.hms_dashboard_grid);
        hmsDashboardGridView.setAdapter(new HmsDashboardAdapter(this,dashboardList));
        DashboardEvent.hmsDashboardItemClick(this,hmsDashboardGridView);


        // get the listview
      //  expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
       // prepareListData();



     //   RestApiData.setRoomStatus(this,expListView);


    }

    private void prepareListData() {
  // listDataHeader = new ArrayList<String>();
//        listDataChild = new HashMap<String, List<RoomStatusModal>>();

        // Adding child data
//        listDataHeader.add("Room Status");
//        listDataHeader.add("Today Sales");
//        listDataHeader.add("Total Sales");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Total Room");
        top250.add("Vacant");
        top250.add("Occupied");
        top250.add("Dirty");
        top250.add("Blocked");
        top250.add("TotalPax");
        top250.add("Ex-Bed");

//        List<String> nowShowing = new ArrayList<String>();
//        nowShowing.add("The Conjuring");
//        nowShowing.add("Despicable Me 2");
//        nowShowing.add("Turbo");
//        nowShowing.add("Grown Ups 2");
//        nowShowing.add("Red 2");
//        nowShowing.add("The Wolverine");
//
//        List<String> comingSoon = new ArrayList<String>();
//        comingSoon.add("2 Guns");
//        comingSoon.add("The Smurfs 2");
//        comingSoon.add("The Spectacular Now");
//        comingSoon.add("The Canyons");
//        comingSoon.add("Europa Report");

       // listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
//        listDataChild.put(listDataHeader.get(1), nowShowing);
//        listDataChild.put(listDataHeader.get(2), comingSoon);
    }
}