package com.jap.course3;

public class VehicleService {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Bike b1=new Bike("100xp","BMW","sportsbike");
        Bike b2=new Bike("KTM","Duke","cruiser");

        Car c1=new Car("Ferrari 100x","Ferrari","SportsCar");
        Car c2=new Car("Swift","Maruti","Sedan");

        System.out.println("*****************For b1 object************************");
        System.out.println(b1);
        System.out.println(b1.getManufactureInformation());
        System.out.println("******************For b2 object************************");
        System.out.println(b2);
        System.out.println(b2.getManufactureInformation());
        System.out.println("*******************For c1 object*************************");
        System.out.println(c1);
        System.out.println(c1.getManufacturerInformation());
        System.out.println("********************For c2 object*************************");
        System.out.println(c2);
        System.out.println(c2.getManufacturerInformation());

    }

}

