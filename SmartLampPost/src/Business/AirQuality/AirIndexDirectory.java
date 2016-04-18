/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirQuality;

import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class AirIndexDirectory {

    private ArrayList<AirIndex> airIndexList;

    public AirIndexDirectory() {
        this.airIndexList = new ArrayList<>();
    }

    public ArrayList<AirIndex> getAirIndexList() {
        return airIndexList;
    }

    public void setAirIndexList(ArrayList<AirIndex> airIndexList) {
        this.airIndexList = airIndexList;
    }

    public AirIndex addAirIndex() {
        AirIndex airIndex = new AirIndex();
        this.airIndexList.add(airIndex);
        return airIndex;
    }

    public void removeAirIndex(AirIndex airIndex) {
        this.airIndexList.remove(airIndex);
    }
}
