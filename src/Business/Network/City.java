/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

/**
 *
 * @author kanikamakhija
 */
public enum  City {

    BOSTON("Boston"),
    NEWYORK("New York"),
    SANFRANSICO("San Fransisco"),
    NEWJERSEY("New Jersey"),
    SANJOSE("San Jose");
               
    
    private String value;
    
    private City(String value) {    
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return this.value;
    }
    
    
    
}
