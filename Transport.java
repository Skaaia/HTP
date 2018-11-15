package com.lesson4;

 public abstract class Transport {
     private double speed;
     private double travelDist;

     public  Transport() {
     }


     public Transport(double speed, double travelDist) {
         this.speed = speed;
         this.travelDist = travelDist;
     }

     public double getSpeed() {
         return speed;
     }

     public void setSpeed(double speed) {
         this.speed = speed;
     }

     public double getTravelDist() {
         return travelDist;
     }

     public void setTravelDist(double travelDist) {
         this.travelDist = travelDist;
     }

     abstract double travelTime();
     abstract int expTime();

 }
