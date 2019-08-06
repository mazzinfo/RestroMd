package org.mazz.restromd.Service;

import org.mazz.restromd.Modal.RoomStatusModal;
import org.mazz.restromd.Modal.TotalRoomStatusModal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiService {

    @GET("roomapi/totalRoomStatus")
    public Call<TotalRoomStatusModal> getRoomStatus();
}
