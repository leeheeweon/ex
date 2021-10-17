package com.company;

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + "is accelerating";
    }

    public String brake() {
        return "starting the " + getClass().getSimpleName() + " is braking";
    }

}

