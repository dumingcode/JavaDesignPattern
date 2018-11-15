package cn.dm.dip.gooddemo;

public class DriverMain {
   public static void main(String [] args){
       Driver driver = new Driver("dm good");
       driver.driverCar(new BMW());
       driver.driverCar(new Benz());
   }

}
