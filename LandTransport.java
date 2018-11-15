package com.lesson5;


public abstract class LandTransport extends Transport {
    private int wheelNumber; //число колес
    private int axisNumber; //число осей

    public LandTransport() {
    }

    public LandTransport(double speed, double travelDist, int wheelNumber) {
        super(speed, travelDist);
        this.wheelNumber = wheelNumber;
    }

    public LandTransport(double speed, double travelDist, int wheelNumber, int axisNumber) {
        super(speed, travelDist);
        this.wheelNumber = wheelNumber;
        this.axisNumber = axisNumber;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public int getAxisNumber() {
        return axisNumber;
    }

    public void setAxisNumber(int axisNumber) {
        this.axisNumber = axisNumber;
    }

    abstract int axisBurden (); //нагрузка на ось
}
