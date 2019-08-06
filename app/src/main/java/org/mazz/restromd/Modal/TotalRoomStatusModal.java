package org.mazz.restromd.Modal;

import com.google.gson.annotations.SerializedName;

public class TotalRoomStatusModal {

    @SerializedName("totalRooms")
    private String totalRooms;
    @SerializedName("vacant")
    private String vacant;
    @SerializedName("dirty")
    private String dirty;
    @SerializedName("occupied")
    private String occupied;
    @SerializedName("blocked")
    private String blocked;
    @SerializedName("totalPax")
    private String totalPax;
    @SerializedName("exBed")
    private String exBed;
    @SerializedName("occPer")
    private String occPer;
    @SerializedName("totalArr")
    private String totalArr;
    @SerializedName("todayDep")
    private String todayDep;
    @SerializedName("dayUse")
    private String dayUse;
    @SerializedName("totalMale")
    private String totalMale;
    @SerializedName("totalFemale")
    private String totalFemale;
    @SerializedName("totalChild")
    private String totalChild;
    @SerializedName("totalContinueRoom")
    private String totalContinueRoom;

    @Override
    public String toString() {
        return "RoomStatusModal{" +
                "totalRooms='" + totalRooms + '\'' +
                ", vacant='" + vacant + '\'' +
                ", dirty='" + dirty + '\'' +
                ", occupied='" + occupied + '\'' +
                ", blocked='" + blocked + '\'' +
                ", totalPax='" + totalPax + '\'' +
                ", exBed='" + exBed + '\'' +
                ", occPer='" + occPer + '\'' +
                ", totalArr='" + totalArr + '\'' +
                ", todayDep='" + todayDep + '\'' +
                ", dayUse='" + dayUse + '\'' +
                ", totalMale='" + totalMale + '\'' +
                ", totalFemale='" + totalFemale + '\'' +
                ", totalChild='" + totalChild + '\'' +
                ", totalContinueRoom='" + totalContinueRoom + '\'' +
                '}';
    }


    public String getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(String totalRooms) {
        this.totalRooms = totalRooms;
    }

    public String getVacant() {
        return vacant;
    }

    public void setVacant(String vacant) {
        this.vacant = vacant;
    }

    public String getDirty() {
        return dirty;
    }

    public void setDirty(String dirty) {
        this.dirty = dirty;
    }

    public String getOccupied() {
        return occupied;
    }

    public void setOccupied(String occupied) {
        this.occupied = occupied;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getTotalPax() {
        return totalPax;
    }

    public void setTotalPax(String totalPax) {
        this.totalPax = totalPax;
    }

    public String getExBed() {
        return exBed;
    }

    public void setExBed(String exBed) {
        this.exBed = exBed;
    }

    public String getOccPer() {
        return occPer;
    }

    public void setOccPer(String occPer) {
        this.occPer = occPer;
    }

    public String getTotalArr() {
        return totalArr;
    }

    public void setTotalArr(String totalArr) {
        this.totalArr = totalArr;
    }

    public String getTodayDep() {
        return todayDep;
    }

    public void setTodayDep(String todayDep) {
        this.todayDep = todayDep;
    }

    public String getDayUse() {
        return dayUse;
    }

    public void setDayUse(String dayUse) {
        this.dayUse = dayUse;
    }

    public String getTotalMale() {
        return totalMale;
    }

    public void setTotalMale(String totalMale) {
        this.totalMale = totalMale;
    }

    public String getTotalFemale() {
        return totalFemale;
    }

    public void setTotalFemale(String totalFemale) {
        this.totalFemale = totalFemale;
    }

    public String getTotalChild() {
        return totalChild;
    }

    public void setTotalChild(String totalChild) {
        this.totalChild = totalChild;
    }

    public String getTotalContinueRoom() {
        return totalContinueRoom;
    }

    public void setTotalContinueRoom(String totalContinueRoom) {
        this.totalContinueRoom = totalContinueRoom;
    }



}
