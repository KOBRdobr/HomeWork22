package ru.zinnurov;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 09.10.2018
 */

public class TV {
    String brand;
    int size;
    int GHz;

    public TV(String brand, int size, int GHz) {
        this.brand = brand;
        this.size = size;
        this.GHz = GHz;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGHz() {
        return GHz;
    }

    public void setGHz(int GHz) {
        this.GHz = GHz;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
