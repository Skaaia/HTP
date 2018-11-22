package com.skaari;

import java.util.Objects;

public class Fridge extends Box<Integer,Integer,Integer> implements FirstInterface,SecondInterface{
    private Brand currentBrand;
    private int usefullVolume;
    private int power;
    private int minTemperature;

    public Fridge() {
    }

    public Fridge(Integer width, Integer depth, Integer heigth, int usefullVolume, int power, int minTemperature, Brand currentBrand) {
        super(width, depth, heigth);
        this.usefullVolume = usefullVolume;
        this.power = power;
        this.minTemperature = minTemperature;
        this.currentBrand = currentBrand;
    }

    public Brand getCurrentBrand() {
        return currentBrand;
    }

    public void setCurrentBrand(Brand currentBrand) {
        this.currentBrand = currentBrand;
    }

    public int getUsefullVolume() {
        return usefullVolume;
    }

    public void setUsefullVolume(int usefullVolume) {
        this.usefullVolume = usefullVolume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fridge fridge = (Fridge) o;
        return usefullVolume == fridge.usefullVolume &&
                power == fridge.power &&
                minTemperature == fridge.minTemperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usefullVolume, power, minTemperature);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "usefullVolume=" + usefullVolume +
                ", brand=" + currentBrand +
                ", brandWorthBuying=" + currentBrand.worthBuying() +
                ", power=" + power +
                ", minTemperature=" + minTemperature +
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
        return (power*minTemperature)/CONS_MULTIPLIER;
    }

    @Override
    public Integer cost() {
        return usefullVolume*power*minTemperature*currentBrand.getCostMultiplierByBrand();
    }
}
