package com.jap.course3;

abstract public class VehicleManufacture {
    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;
    public void setVehicleName(String name) {
        vehicleName=name;
    }
    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleModelName(String modelName) {
        vehicleModelName=modelName;
    }
    public String getVehicleModelName() {
        return vehicleModelName;
    }
    public void setVehicleType(String type) {
        vehicleType=type;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    VehicleManufacture(){
        this("","","");
    }
    VehicleManufacture(String name,String modelName,String type){
        vehicleName=name;
        vehicleModelName=modelName;
        vehicleType=type;
    }
    public abstract String getManufactureInformation();

}

