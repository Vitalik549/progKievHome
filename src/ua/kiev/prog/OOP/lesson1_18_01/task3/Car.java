package ua.kiev.prog.OOP.lesson1_18_01.task3;

/*
    Написать класс «автомобиль», который должен
    уметь заводится, глушить мотор, ехать и держать
    необходимую скорость.
    */

public class Car {

    Car(String name) {
        speed = 0;
        isOn = false;
        this.name = name;
    }

    private int speed;
    private boolean isOn;

    public String getName() {
        return name;
    }

    private String name;

    public void start() {
        System.out.println("Starting the engine...");
        if (isOn) {
            System.out.println("The engine is already working, man");
        } else {
            isOn = true;
            System.out.println("Engine started.");
        }
    }

    public void off() {
        System.out.println("Switching the engine off...");
        if (!isOn) {
            System.out.println("The engine is already off");
        } else if (speed != 0) {
            System.out.println("Stop the car before switching off the engine");
        } else {
            isOn = false;
            System.out.println("Engine switched off.");
        }
    }

    public void stopTheCar() {
        if (speed == 0){
            System.out.println("Your speed is already 0");
        } else {
            System.out.println("Let's stop the car...");
            changeSpeedTo(0);
        }

    }

    private void accelerate(boolean faster, int amount) {
        if (faster) {
            System.out.println("accelerating...");
            for (int i = 0; i < amount; i++) {
                letTheTimeToPass(50);
                speed++;
                System.out.println("Your current speed is " + speed + "km/h");
            }
        } else {
            System.out.println("slowing down...");
            for (int i = 0; i < amount; i++) {
                letTheTimeToPass(50);
                speed--;
                System.out.println("Your current speed is " + speed + "km/h");
            }
        }


    }

    public void changeSpeedTo(int newSpeed) {
        System.out.println("Let's get " + newSpeed + "...");
        int difference = Math.abs(newSpeed - speed);
        if (isOn) {
            if (speed < newSpeed) {
                accelerate(true, difference);
            } else if (speed > newSpeed) {
                accelerate(false, difference);
            } else {
                System.out.println("You speed is already " + speed + " km/h");
            }
        } else {
            System.out.println("Sir, try to turn ON the engine first =)");
        }
    }

    public void keepSpeed(int seconds) {
        System.out.println("let's keep it for " + seconds + " sec...");
        while (seconds > 0) {
            letTheTimeToPass(100 * seconds);
            System.out.println("You will keep speed " + speed + "km/h for " + seconds + " sec more.");
            seconds--;
        }
    }

    private void letTheTimeToPass(int millis) {
        //imitate real speed change
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("You broke the TIME!!!");
        }
    }
}
