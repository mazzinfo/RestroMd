package org.mazz.restromd.Modal;

import com.google.gson.annotations.SerializedName;

public class RoomStatusModal {

    private String roomStatusName;
    private String roomStatusValue;

    public RoomStatusModal(String roomStatusName, String roomStatusValue) {
        this.roomStatusName = roomStatusName;
        this.roomStatusValue = roomStatusValue;
    }

    public RoomStatusModal() {
    }
    @Override
    public String toString() {
        return "RoomStatusModal{" +
                "roomStatusName='" + roomStatusName + '\'' +
                ", roomStatusValue='" + roomStatusValue + '\'' +
                '}';
    }


    public String getRoomStatusName() {
        return roomStatusName;
    }

    public void setRoomStatusName(String roomStatusName) {
        this.roomStatusName = roomStatusName;
    }

    public String getRoomStatusValue() {
        return roomStatusValue;
    }

    public void setRoomStatusValue(String roomStatusValue) {
        this.roomStatusValue = roomStatusValue;
    }
}
