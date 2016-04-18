/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirQuality;

import java.util.Date;

/**
 *
 * @author Priyank
 */
public class AirIndex {

    private float airIndex;
    private float nitrogenDioxide;
    private float sulphurDioxide;
    private float carbonMonoxide;
    private float ozone;
    private float particulateMatter;
    private int id;
    private static int count = 0;
    private Date timeStamp;
    private String result;

    public AirIndex() {
        count++;
        id = count;
    }

    public float getAirIndex() {
        return airIndex;
    }

    public void setAirIndex(float airIndex) {
        this.airIndex = airIndex;
    }

    public float getNitrogenDioxide() {
        return nitrogenDioxide;
    }

    public void setNitrogenDioxide(float nitrogenDioxide) {
        this.nitrogenDioxide = nitrogenDioxide;
    }

    public float getSulphurDioxide() {
        return sulphurDioxide;
    }

    public void setSulphurDioxide(float sulphurDioxide) {
        this.sulphurDioxide = sulphurDioxide;
    }

    public float getCarbonMonoxide() {
        return carbonMonoxide;
    }

    public void setCarbonMonoxide(float carbonMonoxide) {
        this.carbonMonoxide = carbonMonoxide;
    }

    public float getOzone() {
        return ozone;
    }

    public void setOzone(float ozone) {
        this.ozone = ozone;
    }

    public float getParticulateMatter() {
        return particulateMatter;
    }

    public void setParticulateMatter(float particulateMatter) {
        this.particulateMatter = particulateMatter;
    }

    public int getId() {
        return id;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    @Override
    public String toString(){
        return this.getResult();
    }

}
