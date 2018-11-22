package com.skaari;

import java.util.Objects;

public class Microwave extends Box<Integer,Integer,Integer> implements FirstInterface,SecondInterface{
    private int turnRate;
    private int power;
    private int usefullVolume;
    private Brand currentBrand;

    public Microwave() {
    }

    public Microwave(Integer width, Integer depth, Integer heigth, int power, int usefullVolume, Brand currentBrand) {
        super(width, depth, heigth);
        this.power = power;
        this.usefullVolume = usefullVolume;
        this.currentBrand = currentBrand;
    }

    public Brand getCurrentBrand() {
        return currentBrand;
    }

    public void setCurrentBrand(Brand currentBrand) {
        this.currentBrand = currentBrand;
    }

    public int getTurnRate() {
        return turnRate;
    }

    public void setTurnRate(int turnRate) {
        this.turnRate = turnRate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getUsefullVolume() {
        return usefullVolume;
    }

    public void setUsefullVolume(int usefullVolume) {
        this.usefullVolume = usefullVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Microwave microwave = (Microwave) o;
        return turnRate == microwave.turnRate &&
                power == microwave.power &&
                usefullVolume == microwave.usefullVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(turnRate, power, usefullVolume);
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "turnRate=" + turnRate +
                ", brand=" + currentBrand +
                ", brandWorthBuying=" + currentBrand.worthBuying() +
                ", power=" + power +
                ", usefullVolume=" + usefullVolume +
                ", width=" + getWidth() +
                ", depth=" + getDepth() +
                ", heigth=" + getHeigth() +
                '}';
    }

    @Override
    Integer volume() {
        return getWidth()*getDepth()*getHeigth();
    }

    @Override
    public Integer elecCons() {
        return (power*turnRate)/CONS_MULTIPLIER;
    }

    @Override
    public Integer cost() {
        return usefullVolume*power*turnRate*currentBrand.getCostMultiplierByBrand();
    }
}
