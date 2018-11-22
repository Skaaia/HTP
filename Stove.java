package com.skaari;

import java.util.Objects;

public class Stove extends Box<Integer,Integer,Integer> implements FirstInterface,SecondInterface {
    private int usefullVolume;
    private int maxTemperature;
    private int power;
    private Brand currentBrand;

    public Stove() {
    }

    public Stove(Integer width, Integer depth, Integer heigth, int usefullVolume, int maxTemperature, int power, Brand currentBrand) {
        super(width, depth, heigth);
        this.usefullVolume = usefullVolume;
        this.maxTemperature = maxTemperature;
        this.power = power;
        this.currentBrand = currentBrand;
    }

    public Stove(Integer width, Integer depth, Integer heigth, int usefullVolume, int maxTemperature, int power) {
        super(width, depth, heigth);
        this.usefullVolume = usefullVolume;
        this.maxTemperature = maxTemperature;
        this.power = power;
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

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stove stove = (Stove) o;
        return usefullVolume == stove.usefullVolume &&
                maxTemperature == stove.maxTemperature &&
                power == stove.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usefullVolume, maxTemperature, power);
    }

    @Override
    public String toString() {
        return "Stove{" +
                "usefullVolume=" + usefullVolume +
                ", brand=" + currentBrand +
                ", brandWorthBuying=" + currentBrand.worthBuying() +
                ", maxTemperature=" + maxTemperature +
                ", power=" + power +
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
        return (power*maxTemperature)/CONS_MULTIPLIER;
    }

    @Override
    public Integer cost() {
        return usefullVolume*power*maxTemperature*currentBrand.getCostMultiplierByBrand();
    }


}
