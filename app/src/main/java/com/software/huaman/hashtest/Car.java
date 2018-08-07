package com.software.huaman.hashtest;

public class Car {
    String Brand;
    String Model;

    public Car(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
