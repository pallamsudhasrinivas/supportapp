package com.mphasis.supportapp.servicenow;


public class TicketDetails {

    private int openIncidents;
    private int highPriority;
    private int mediumPriority;
    private int lowPriority;

    public TicketDetails(int openIncidents, int highPriority, int mediumPriority, int lowPriority) {
        this.openIncidents = openIncidents;
        this.highPriority = highPriority;
        this.mediumPriority = mediumPriority;
        this.lowPriority = lowPriority;
    }

    public int getOpenIncidents() {
        return openIncidents;
    }

    public void setOpenIncidents(int openIncidents) {
        this.openIncidents = openIncidents;
    }

    public int getHighPriority() {
        return highPriority;
    }

    public void setHighPriority(int highPriority) {
        this.highPriority = highPriority;
    }

    public int getMediumPriority() {
        return mediumPriority;
    }

    public void setMediumPriority(int mediumPriority) {
        this.mediumPriority = mediumPriority;
    }

    public int getLowPriority() {
        return lowPriority;
    }

    public void setLowPriority(int lowPriority) {
        this.lowPriority = lowPriority;
    }
}
