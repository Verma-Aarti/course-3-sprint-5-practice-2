package com.jap.course3;

public class Car extends VehicleManufacturer implements Vehicle {
    Car(){
        super();
    }
    Car(String name,String model,String type){
        super(name,model,type);
    }
    public int maxspeed(String type) {
        if(type.equalsIgnoreCase("sportscar")) {
            return 250;
        }
        else if(type.equalsIgnoreCase("sedan")) {
            return 170;
        }
        else {
            return 0;
        }
    }
    public String getManufacturerInformation() {
        return  "Car{Manufacturer name :"+super.getVehicleName()+",Model Name:"+super.getVehicleModelName()+",Model Type:"
                +super.getVehicleType()+"}";
    }

    public String toString() {
        return "Car type is "+super.getVehicleType()+" its speed is "+maxspeed(super.getVehicleType());
    }

}

