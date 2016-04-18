/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resident;

import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class ResidentDirectory {

    private ArrayList<Resident> residentList;

    public ResidentDirectory() {
        this.residentList = new ArrayList<>();
    }

    public Resident createResident() {
        Resident resident = new Resident();
        this.residentList.add(resident);
        return resident;
    }

    public void removeResident(Resident resident) {
        this.residentList.remove(resident);
    }

    public ArrayList<Resident> getResidentList() {
        return residentList;
    }

    public void setResidentList(ArrayList<Resident> residentList) {
        this.residentList = residentList;
    }

    public Resident searchResident(String firstName, String lastName) {
        for (Resident resident : residentList) {
            if (resident.getFirstName() == firstName && resident.getLastName() == lastName) {
                return resident;
            }
        }
        return null;
    }
}
