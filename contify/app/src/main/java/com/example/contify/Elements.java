package com.example.contify;

import android.widget.ImageView;

public class Elements {
    String Name;
    double Atomic_Mass;
    public int  image;
    String Symbol;
    int Atomic_Number;
    String Common;

    public Elements(String name, double atomic_Mass, int image, String symbol, int atomic_Number, String common) {
        Name = name;
        Atomic_Mass = atomic_Mass;
        this.image = image;
        Symbol = symbol;
        Atomic_Number = atomic_Number;
        Common = common;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getAtomic_Mass() {
        return Atomic_Mass;
    }

    public void setAtomic_Mass(double atomic_Mass) {
        Atomic_Mass = atomic_Mass;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public int getAtomic_Number() {
        return Atomic_Number;
    }

    public void setAtomic_Number(int atomic_Number) {
        Atomic_Number = atomic_Number;
    }

    public String getCommon() {
        return Common;
    }

    public void setCommon(String common) {
        Common = common;
    }
}
