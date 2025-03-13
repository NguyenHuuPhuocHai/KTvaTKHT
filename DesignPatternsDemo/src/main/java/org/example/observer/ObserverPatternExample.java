package org.example.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Subject weatherStation = new Subject();

        Observer phone = new MobileDevice("iPhone");
        Observer tv = new NewsChannel("VTV1");

        weatherStation.attach(phone);
        weatherStation.attach(tv);

        weatherStation.setMessage("Trời đang mưa ☔");
        weatherStation.setMessage("Trời nắng đẹp ☀️");
    }
}
