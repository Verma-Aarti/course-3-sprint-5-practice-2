package com.jap.course3;

public class Bike extends VehicleManufacture implements Vehicle {
    Bike(){
        super();
    }
    Bike(String name,String model,String type){
        super(name,model,type);
    }



    public int maxspeed(String type) {
        if(type.equalsIgnoreCase("sportsbike")) {
            return 300;
        }
        if(type.contentEquals("cruiser")) {
            return 170;
        }
        else {
            return 0;
        }
    }
    public String getManufactureInformation() {
        return "Bike{Manufacturer name :"+super.getVehicleName()+",Model Name:"+super.getVehicleModelName()+",Model Type:"
                +super.getVehicleType()+"}";
    }

    public String toString() {
        return "Bike type is "+super.getVehicleType()+" its speed is "+maxspeed(super.getVehicleType());
    }


}

