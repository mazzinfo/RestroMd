package org.mazz.restromd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import org.mazz.restromd.Adapter.HmsDashboardAdapter;
import org.mazz.restromd.Event.HmsDashboardEvent;
import org.mazz.restromd.Modal.DashboardModal;

import java.util.ArrayList;


public class HmsFragment extends Fragment {
    GridView hmsDashboardGridView;
    ArrayList<DashboardModal> dashboardList=new ArrayList<DashboardModal>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.fragment_hms, container, false);

        DashboardModal dm=new DashboardModal("Room Status",0);
        DashboardModal dm1=new DashboardModal("Today Sale",0);
        DashboardModal dm2=new DashboardModal("Total Sale",0);
        dashboardList.add(dm);
        dashboardList.add(dm1);
        dashboardList.add(dm2);

        hmsDashboardGridView = (GridView) retView.findViewById(R.id.hms_dashboard_grid);
        hmsDashboardGridView.setAdapter(new HmsDashboardAdapter(getActivity(),dashboardList));
        HmsDashboardEvent.hmsDashboardItemClick(getActivity(),hmsDashboardGridView);
        return retView;
    }
}
