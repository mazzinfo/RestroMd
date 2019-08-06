package org.mazz.restromd.Data;

import android.content.Context;
import android.util.Log;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import org.mazz.restromd.Adapter.HmsExpandableListAdapter;
import org.mazz.restromd.Adapter.RoomStatusGridAdapter;
import org.mazz.restromd.Modal.RoomStatusModal;
import org.mazz.restromd.Modal.TotalRoomStatusModal;
import org.mazz.restromd.Util.RestApiUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestApiData {



    public static void setRoomStatus(final Context context, final ExpandableListView expListView ) {



        RestApiUtil.getServiceClass().getRoomStatus().enqueue(new Callback<TotalRoomStatusModal>() {

            HmsExpandableListAdapter hmsListAdapter;

            List<String> listDataHeader=new ArrayList<>();
            HashMap<String, List<RoomStatusModal>> listDataChild=new HashMap<>();






        TotalRoomStatusModal trm=new TotalRoomStatusModal();
            ArrayList<RoomStatusModal> total= new ArrayList<>();
            ArrayList<RoomStatusModal> totalSale= new ArrayList<>();
            ArrayList<RoomStatusModal> sales= new ArrayList<>();


            @Override
            public void onResponse(Call<TotalRoomStatusModal> call, Response<TotalRoomStatusModal> response) {
                if (response.isSuccessful()) {
                    trm = (TotalRoomStatusModal) response.body();



                    Log.d("Rest Api Result", "Returned count " + Objects.requireNonNull(trm.toString()));

                    listDataHeader.add("Room Status");
                    listDataHeader.add("Today Sales");
                    listDataHeader.add("Total Sales");

                    total.add(new RoomStatusModal("Total Room",trm.getTotalRooms()));
                    total.add(new RoomStatusModal("Ready",trm.getVacant()));
                    total.add(new RoomStatusModal("Occupied",trm.getOccupied()));
                    total.add(new RoomStatusModal("Blocked",trm.getBlocked()));
                    total.add(new RoomStatusModal("Total Pax",trm.getTotalPax()));
                    total.add(new RoomStatusModal("occ %",trm.getOccPer()));
                    total.add(new RoomStatusModal("Total Arrival",trm.getTotalArr()));
                    total.add(new RoomStatusModal("Today Departure",trm.getTodayDep()));
                    total.add(new RoomStatusModal("Day Use",trm.getDayUse()));

                    total.add(new RoomStatusModal("Total Male",trm.getTotalMale()));
                    total.add(new RoomStatusModal("Total Female",trm.getTotalFemale()));
                    total.add(new RoomStatusModal("totalChild",trm.getTotalChild()));
                    total.add(new RoomStatusModal("Total Continue Room",trm.getTotalContinueRoom()));

                    listDataChild.put(listDataHeader.get(0), total);
                    listDataChild.put(listDataHeader.get(1), totalSale);
                    listDataChild.put(listDataHeader.get(2), sales);



                hmsListAdapter = new HmsExpandableListAdapter(context,listDataHeader, listDataChild);

//                    // setting list adapter
                    expListView.setAdapter(hmsListAdapter);



                }
            }

            @Override
            public void onFailure(Call<TotalRoomStatusModal> call, Throwable t) {
                Log.d(" Rest Api Error", "error loading from API" + t.getMessage());
            }

        });
    }


    public static void setRoomStatusGrid(final Context context, final GridView roomStatusGrid, final TextView totTextView) {



        RestApiUtil.getServiceClass().getRoomStatus().enqueue(new Callback<TotalRoomStatusModal>() {

            RoomStatusGridAdapter roomStatusGridAdapter;
            TotalRoomStatusModal trm=new TotalRoomStatusModal();
            ArrayList<RoomStatusModal> total= new ArrayList<>();



            @Override
            public void onResponse(Call<TotalRoomStatusModal> call, Response<TotalRoomStatusModal> response) {
                if (response.isSuccessful()) {
                    trm = (TotalRoomStatusModal) response.body();

                    Log.d("Rest Api Result", "Returned count " + Objects.requireNonNull(trm.toString()));
                    totTextView.setText("Total Rooms ( "+trm.getTotalRooms()+" )");

                   // total.add(new RoomStatusModal("Total Room",trm.getTotalRooms()));

                    total.add(new RoomStatusModal("Occupied",trm.getOccupied()));
                    total.add(new RoomStatusModal("Vacant",trm.getVacant()));
                    total.add(new RoomStatusModal("Dirty",trm.getDirty()));
                    total.add(new RoomStatusModal("Blocked",trm.getBlocked()));
                    total.add(new RoomStatusModal("Today Arrival",trm.getTotalArr()));
                    total.add(new RoomStatusModal("Today Departure",trm.getTodayDep()));
                    total.add(new RoomStatusModal("Total Pax",trm.getTotalPax()));
                    total.add(new RoomStatusModal("occ %",trm.getOccPer()));

                    total.add(new RoomStatusModal("Day Use",trm.getDayUse()));
                    total.add(new RoomStatusModal("Total Continue Room",trm.getTotalContinueRoom()));
//                    total.add(new RoomStatusModal("Total Male",trm.getTotalMale()));
//                    total.add(new RoomStatusModal("Total Female",trm.getTotalFemale()));
//                    total.add(new RoomStatusModal("totalChild",trm.getTotalChild()));


                    roomStatusGridAdapter = new RoomStatusGridAdapter(context,total);

//                    // setting list adapter
                    roomStatusGrid.setAdapter(roomStatusGridAdapter);



                }
            }

            @Override
            public void onFailure(Call<TotalRoomStatusModal> call, Throwable t) {
                Log.d(" Rest Api Error", "error loading from API" + t.getMessage());
            }

        });
    }

}
