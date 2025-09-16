/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Anisa
 */
public class CarBeraksi {
    public static void main(String[] args) {
        Car myCar = new Car("Silver", "B 4567 sw", 180, 140, "Daihatsu");

        System.out.println("Informasi Mobil:");
        System.out.println("Warna   : " + myCar.getColor());
        System.out.println("Plat No : " + myCar.getNoPlate());
        System.out.println("Lebar   : " + myCar.getWidth());
        System.out.println("Tinggi  : " + myCar.getHeight());
        System.out.println("Merek   : " + myCar.getBrand());

        System.out.println("\nCoba fungsi mobil:");
        myCar.startEngine();
        myCar.throttle();
        myCar.brake();
        myCar.turnOnHeadLamp();
        myCar.turnOffHeadLamp();
    }
}
