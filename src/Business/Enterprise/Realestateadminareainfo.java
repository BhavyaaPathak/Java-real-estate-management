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
public class Realestateadminareainfo {
     private String street;
    private String city;
    private String state;
    private String zipcode;
    private String area;
    private String numofbuilfdings;
    private String requestid;
    private String realestatnme;
    private String status;
    private static long idCounter = 1;
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumofbuilfdings() {
        return numofbuilfdings;
    }

    public void setNumofbuilfdings(String numofbuilfdings) {
        this.numofbuilfdings = numofbuilfdings;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getRealestatnme() {
        return realestatnme;
    }

    public void setRealestatnme(String realestatnme) {
        this.realestatnme = realestatnme;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String toString() {
        return this.getCity(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public synchronized String requestID() {
        return String.valueOf(idCounter++);
    }
}
