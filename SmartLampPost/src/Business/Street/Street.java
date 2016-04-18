/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Street;

import Business.Sensor.SensorDirectory;

/**
 *
 * @author Priyank
 */
public class Street {

    private String streetName;
    private int id;
    private static int count = 0;
    private SensorDirectory sensorDirectory;

    public Street() {
        count++;
        id = count;
        sensorDirectory = new SensorDirectory();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getId() {
        return id;
    }

    public SensorDirectory getSensorDirectory() {
        return sensorDirectory;
    }

    public void setSensorDirectory(SensorDirectory sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }

    @Override
    public String toString() {
        return this.streetName;
    }
}
