package com.skaari;

import java.util.Objects;

public class Washer extends Box<Double,Integer,Integer> implements FirstInterface,SecondInterface {
    private int usefullVolume;
    private int turnRate;
    private int maxWeight;
    private Brand currentBrand;

    public Washer() {
    }

    public Washer(Double width, Integer depth, Integer heigth, int usefullVolume, int turnRate, int maxWeight, Brand currentBrand) {
        super(width, depth, heigth);
        this.usefullVolume = usefullVolume;
        this.turnRate = turnRate;
        this.maxWeight = maxWeight;
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

    public int getTurnRate() {
        return turnRate;
    }

    public void setTurnRate(int turnRate) {
        this.turnRate = turnRate;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Washer washer = (Washer) o;
        return usefullVolume == washer.usefullVolume &&
                turnRate == washer.turnRate &&
                maxWeight == washer.maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usefullVolume, turnRate, maxWeight);
    }

    @Override
    public String toString() {
        return "Washer{" +
                "usefullVolume=" + usefullVolume +
                ", brand=" + currentBrand +
                ", brandWorthBuying=" + currentBrand.worthBuying() +
                ", turnRate=" + turnRate +
                ", maxWeight=" + maxWeight +
                ", width=" + getWidth() +
                ", depth=" + getDepth() +
                ", heigth=" + getHeigth() +
                '}';
    }

    @Override
    public Double volume() {
       return getWidth()*getDepth()*getHeigth();
    }

    @Override
    public Integer elecCons() {
        return (turnRate*maxWeight)/CONS_MULTIPLIER;
    }

    @Override
    public Integer cost() {
        return usefullVolume*maxWeight*turnRate*currentBrand.getCostMultiplierByBrand();
    }
}
