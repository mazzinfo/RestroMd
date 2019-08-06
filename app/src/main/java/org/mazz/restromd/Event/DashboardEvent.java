package org.mazz.restromd.Event;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import org.mazz.restromd.HmsActivity;
import org.mazz.restromd.MainActivity;
import org.mazz.restromd.Modal.DashboardModal;

public class DashboardEvent {

    public static void dashboardItemClick(final Context context, GridView gridView) {

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DashboardModal item = (DashboardModal) parent.getItemAtPosition(position);

                if(item.getDashboardText().equals("HMS")) {

                    Intent myIntent = new Intent(context, HmsActivity.class);

                   // myIntent.putExtra("table_data",  item);
                    context.startActivity(myIntent);

                }


            }


        });
    }

    public static void hmsDashboardItemClick(final Context context, GridView gridView) {

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DashboardModal item = (DashboardModal) parent.getItemAtPosition(position);

                if(item.getDashboardText().equals("Room Status")) {

                    Intent myIntent = new Intent(context, MainActivity.class);

                    // myIntent.putExtra("table_data",  item);
                    context.startActivity(myIntent);

                }


            }


        });
    }
}
