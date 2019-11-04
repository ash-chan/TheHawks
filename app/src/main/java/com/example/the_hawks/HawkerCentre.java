
package com.example.the_hawks;

import java.util.ArrayList;

public class HawkerCentre {
    private String name;
    private String address;
    private int stallCount;
    private double aggregate;
    public type enumType;
    private ArrayList <HawkerStall> hawkerStalls;

    //constructor
    public HawkerCentre(String name, String address, int stallCount, double aggregate, ArrayList <HawkerStall> hawkerStalls){
        this.name = name;
        this.address = address;
        this.stallCount = stallCount;
        this.aggregate = aggregate;
        this.hawkerStalls = hawkerStalls;
    }

    public enum type{
        MHC,
        HC;
    }

    public int getStallCount(){
        return stallCount;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }


    public void setEnum(String value){
        if(value.matches("MHC")){
            enumType = type.MHC;
        }
        if(value.matches("HC")){
            enumType = type.HC;
        }
    }

    double getAggregate(){
        return aggregate;
    }



}
