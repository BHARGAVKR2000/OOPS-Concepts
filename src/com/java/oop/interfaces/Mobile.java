package com.java.oop.interfaces;

public interface Mobile {
    public void call();
}

interface SmartPhone{
    public void Camera();
}

class Samsung implements SmartPhone, Mobile{

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void Camera() {
        System.out.println("Camera On..");
    }
}
