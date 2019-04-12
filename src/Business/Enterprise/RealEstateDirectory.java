/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author kanikamakhija
 */
public class RealEstateDirectory {
    private ArrayList<RealEstate> realEstateList;
    
    public RealEstateDirectory(){
        realEstateList = new ArrayList<RealEstate>();
    }

    public ArrayList<RealEstate> getRealEstateList() {
        return realEstateList;
    }

    public void setRealEstateList(ArrayList<RealEstate> realEstateList) {
        this.realEstateList = realEstateList;
    }
    
    public RealEstate addRealEstate() {
        RealEstate estate = new RealEstate();
        this.realEstateList.add(estate);
        return estate;
    }
}
