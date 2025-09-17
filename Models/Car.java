/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

/**
 *
 * @author Anisa
 */
public class Car implements CarFunction {
    private String color;
    private String noPlate;
    private int width;
    private int height;
    private String brand;

   
    public Car(String color, String noPlate, int width, int height, String brand) {
        this.color = color;
        this.noPlate = noPlate;
        this.width = width;
        this.height = height;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void startEngine() {
        System.out.println("Mesin mobil dinyalakan.");
    }

    @Override
    public void throttle() {
        System.out.println("Mobil dipercepat (gas).");
    }

    @Override
    public void brake() {
        System.out.println("Mobil direm.");
    }

    @Override
    public void turnOnHeadLamp() {
        System.out.println("Lampu depan dinyalakan.");
    }

    @Override
    public void turnOffHeadLamp() {
        System.out.println("Lampu depan dimatikan.");
    }
}
