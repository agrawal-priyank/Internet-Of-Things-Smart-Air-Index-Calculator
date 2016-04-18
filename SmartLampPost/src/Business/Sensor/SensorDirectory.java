/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensor;

import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class SensorDirectory {

    private ArrayList<Sensor> sensorList;

    public SensorDirectory() {
        this.sensorList = new ArrayList<>();
    }

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public Sensor createSensor() {
        Sensor s = new Sensor();
        this.sensorList.add(s);
        return s;
    }

    public void removeSensor(Sensor s) {
        this.sensorList.remove(s);
    }

    public Sensor searchSensor(String sensorName) {
        for (Sensor s : sensorList) {
            if (s.getSensorName() == sensorName) {
                return s;
            }
        }
        return null;
    }

}
