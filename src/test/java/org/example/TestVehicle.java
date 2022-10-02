package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

class TestVehicle {
    Vehicle vehicle;
    HashMap<Color, String> colors = new HashMap<>();

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle();
        colors.put(Color.BLACK, "Black");
        colors.put(Color.BLUE, "Blue");
        colors.put(Color.RED, "Red");
    }

    @Test
    void testSetManufacturer(){
        vehicle.setManufacturer("Rolls-Royce");
        assertEquals("Rolls-Royce", vehicle.getManufacturer());
    }

    @Test
    void testSetMileage(){
        vehicle.setMileage(600);
        assertEquals(600, vehicle.getMileage());
    }

    @Test
    void testSetModel(){
        vehicle.setModel("Phantom");
        assertEquals("Phantom", vehicle.getModel());
    }

    @Test
    void testSetColor(){
        for (Color col: colors.keySet()){
            vehicle.setColor(col);
            assertEquals(colors.get(col), vehicle.getColor());
        }
    }

    @Test
    void testSetType(){
        vehicle.setType(Type.BIKE);
        assertEquals(Type.BIKE, vehicle.getType());
    }
}