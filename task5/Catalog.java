package com.skaaria.task5;

import java.util.Objects;

public class Catalog {
    private String category;
    private int numberOfItems;

    public Catalog() {
    }

    public Catalog(String category, int numberOfItems) {
        this.category = category;
        this.numberOfItems = numberOfItems;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return numberOfItems == catalog.numberOfItems &&
                Objects.equals(category, catalog.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, numberOfItems);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "category='" + category + '\'' +
                ", numberOfItems=" + numberOfItems +
                '}';
    }
}
