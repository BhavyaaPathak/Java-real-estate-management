/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;


/**
 *
 * @author parth
 */
public class Tenant {
 private String managementName;
 private String realestateName;
 private int apartmentNumber;
 private ApartmentType Br;

    public enum ApartmentType{
        BR1,
        BR2,
        BR3;
    }
 
 
    public String getManagementName() {
        return managementName;
    }

    public void setManagementName(String managementName) {
        this.managementName = managementName;
    }

    public String getRealestateName() {
        return realestateName;
    }

    public void setRealestateName(String realestateName) {
        this.realestateName = realestateName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public ApartmentType getBr() {
        return Br;
    }

    public void setBr(ApartmentType Br) {
        this.Br = Br;
    }

    
    
 }
