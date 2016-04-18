/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensor;

import Business.AirQuality.AirIndexDirectory;

/**
 *
 * @author Priyank
 */
public class Sensor {

    private String sensorName;
    private int sensorId;
    private static int count = 0;
    private double latitude;
    private double longitude;
    private boolean status;
    private AirIndexDirectory airIndexDirectory;

    public Sensor() {
        count++;
        sensorId = count;
        airIndexDirectory = new AirIndexDirectory();
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public int getSensorId() {
        return sensorId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public AirIndexDirectory getAirIndexDirectory() {
        return airIndexDirectory;
    }

    public void setAirIndexDirectory(AirIndexDirectory airIndexDirectory) {
        this.airIndexDirectory = airIndexDirectory;
    }

    @Override
    public String toString() {
        return this.sensorName;
    }
}
