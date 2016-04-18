/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Street;

import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class StreetDirectory {

    private ArrayList<Street> streetList;

    public StreetDirectory() {
        this.streetList = new ArrayList<>();
    }

    public ArrayList<Street> getStreetList() {
        return streetList;
    }

    public void setStreetList(ArrayList<Street> streetList) {
        this.streetList = streetList;
    }

    public Street addStreet() {
        Street street = new Street();
        streetList.add(street);
        return street;
    }

    public void removeStreet(Street street) {
        this.streetList.remove(street);
    }
}
