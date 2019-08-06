package org.mazz.restromd.Modal;

public class DashboardModal {

    private  String dashboardText;
    private int dashboardImage;

    public String getDashboardText() {
        return dashboardText;
    }

    public void setDashboardText(String dashboardText) {
        this.dashboardText = dashboardText;
    }

    public int getDashboardImage() {
        return dashboardImage;
    }

    public void setDashboardImage(int dashboardImage) {
        this.dashboardImage = dashboardImage;
    }

    public DashboardModal(String dashboardText, int dashboardImage) {
        this.dashboardText = dashboardText;
        this.dashboardImage = dashboardImage;
    }





}
