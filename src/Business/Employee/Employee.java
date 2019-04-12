/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person;

/**
 *
 * @author bhavyapathak
 */
public class Employee extends Person {

    private String name;
    private int id;
    private static int count = 1;
    private String requestid;
    private static long idCounter = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return name;
    }

    public synchronized String requestID() {
        return String.valueOf(idCounter++);
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
