/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class RealEstateMain {
   private ArrayList<RealEstateAdminPersonalInfo> readminacc;
   private ArrayList<Realestateadminareainfo> areainfo;
public RealEstateMain()
   {
       readminacc = new ArrayList<RealEstateAdminPersonalInfo>();
       areainfo = new ArrayList<Realestateadminareainfo>();
   }    

public RealEstateAdminPersonalInfo addadmin(){
    RealEstateAdminPersonalInfo acc= new RealEstateAdminPersonalInfo();
    this.readminacc.add(acc);
    return acc;
}



public Realestateadminareainfo addarea(){
    Realestateadminareainfo area= new Realestateadminareainfo();
    this.areainfo.add(area);
    return area;
}

    public ArrayList<RealEstateAdminPersonalInfo> getReadminacc() {
        return readminacc;
    }

    public void setReadminacc(ArrayList<RealEstateAdminPersonalInfo> readminacc) {
        this.readminacc = readminacc;
    }

    public ArrayList<Realestateadminareainfo> getAreainfo() {
        return areainfo;
    }

    public void setAreainfo(ArrayList<Realestateadminareainfo> areainfo) {
        this.areainfo = areainfo;
    }

}
