package com.lesson5;

import java.util.Objects;

//Comparable<Bus>

public class Bus extends LandTransport implements FirstInterface,SecondInterface {
    private static final int CURRENT_YEAR = 2018;
    private  String carBrand;
    private int startExp;
    private String driverSurname;
    private int number;
    private int routeNumber;
    private int dist;
    private int weight;

    public Bus() {
    }

    public Bus(double speed, double travelDist, int wheelNumber, int axisNumber, String carBrand, int startExp, String driverSurname, int number, int routeNumber, int dist, int weight) {
        super(speed, travelDist, wheelNumber, axisNumber);
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
        this.number = number;
        this.routeNumber = routeNumber;
        this.dist = dist;
        this.weight = weight;
    }

    public Bus(double speed, double travelDist, int wheelNumber, int axisNumber, String carBrand, int startExp, String driverSurname, int number, int routeNumber, int dist) {
        super(speed, travelDist, wheelNumber, axisNumber);
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
        this.number = number;
        this.routeNumber = routeNumber;
        this.dist = dist;
    }

    public Bus(double speed, double travelDist, int wheelNumber, int axisNumber, String carBrand, int startExp, String driverSurname, int number, int routeNumber) {
        super(speed, travelDist, wheelNumber, axisNumber);
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
        this.number = number;
        this.routeNumber = routeNumber;
    }

    public Bus(double speed, double travelDist, int wheelNumber, int axisNumber, String carBrand, int startExp, String driverSurname, int number) {
        super(speed, travelDist, wheelNumber, axisNumber);
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
        this.number = number;
    }

    public Bus(double speed, double travelDist, int wheelNumber, int axisNumber, String carBrand, int startExp, String driverSurname) {
        super(speed, travelDist, wheelNumber, axisNumber);
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
    }

    public Bus(double speed, double travelDist, int wheelNumber, int axisNumber, String carBrand, int startExp) {
        super(speed, travelDist, wheelNumber, axisNumber);
        this.carBrand = carBrand;
        this.startExp = startExp;
    }

    public Bus(double speed, double travelDist, int wheelNumber, int axisNumber, String carBrand) {
        super(speed, travelDist, wheelNumber, axisNumber);
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getStartExp() {
        return startExp;
    }

    public void setStartExp(int startExp) {
        this.startExp = startExp;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return startExp == bus.startExp &&
                number == bus.number &&
                routeNumber == bus.routeNumber &&
                dist == bus.dist &&
                weight == bus.weight &&
                Objects.equals(carBrand, bus.carBrand) &&
                Objects.equals(driverSurname, bus.driverSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, startExp, driverSurname, number, routeNumber, dist, weight);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "carBrand='" + carBrand + '\'' +
                ", startExp=" + startExp +
                ", driverSurname='" + driverSurname + '\'' +
                ", number=" + number +
                ", routeNumber=" + routeNumber +
                ", dist=" + dist +
                ", weight=" + weight +
                ", wheelNumber=" + getWheelNumber() +
                ", axisNumber=" + getAxisNumber() +
                ", speed=" + getSpeed() +
                ", travelDist=" + getTravelDist() +
                '}';
    }

    @Override
    public int axisBurden() {
        return weight/getAxisNumber();
    }

    public int axisBurden(int multiplier){
        return (weight/getAxisNumber())*multiplier;
    }

    @Override
    public double travelTime() {
        return getTravelDist()/getSpeed();
    }

    @Override
    int expTime() {
        return CURRENT_YEAR -startExp;
    }

    @Override
    public Integer cost() {
        return COST_MULTIPLIER *(STARING_COST /(expTime()*dist));
    }

    @Override
    public Double fuelBurnInStanding() {
        return (expTime()*dist* FUEL_MULTIPLIER);
    }

    @Override
    public Double fuelBurnInMotion() {
        return (expTime()*dist* FUEL_MULTIPLIER)*getSpeed();
    }



}