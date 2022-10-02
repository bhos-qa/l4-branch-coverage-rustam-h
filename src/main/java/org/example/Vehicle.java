package org.example;

enum Color{
    BLACK,
    BLUE,
    RED
}

enum Type{
    CAR,
    TRUCK,
    BIKE
}

public class Vehicle {
    String manufacturer = "Toyota";
    String model = "Prius";
    int mileage = 400;
    Color color = Color.RED;
    Type type = Type.CAR;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        String color = "Unknown";
        switch (this.color) {
            case BLACK:
                color = "Black";
                break;
            case BLUE:
                color = "Blue";
                break;
            case RED:
                color = "Red";
                break;
            default:
                color = "Other";
                break;
        }
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}