package com.sassoni.urbanraccoon.wearnextbus;

public class Stop {
    private String id;
    private double lat;
    private double lon;

    public Stop(String id, double lat, double lon) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
    }

    public String getId() {
        return id;
    }
}
