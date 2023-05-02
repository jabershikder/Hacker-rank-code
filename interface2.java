
interface vehicle {
    void GearChange(int x);

    void SpeedIncrease(int x);

    void Breaks(int x);
}

class bike implements vehicle {
    int speed = 50;
    int gear = 1;

    public void GearChange(int x) {
        if (gear + x > 5) {
            gear = x;
        } else {
            gear = gear + x;
        }
    }

    public void SpeedIncrease(int x) {
        speed = speed + x;
    }

    public void Breaks(int x) {
        speed = speed - x;
    }

    void print() {
        System.out.println("Speed of bike: " + speed);
        System.out.println("Gear of bike: " + gear);
    }
}

class car implements vehicle {
    int speed = 150;
    int gear = 3;

    public void GearChange(int x) {
        if (gear + x > 5) {
            gear = x;
        } else {
            gear = gear + x;
        }

    }

    public void SpeedIncrease(int x) {
        speed = speed + x;
    }

    public void Breaks(int x) {
        speed = speed - x;
    }

    void print() {
        System.out.println("Speed of car: " + speed);
        System.out.println("Gear of car: " + gear);
    }
}

class interface2 {
    public static void main(String args[]) {
        bike b1 = new bike();
        car c1 = new car();
        b1.GearChange(2);
        b1.Breaks(20);
        b1.SpeedIncrease(10);
        b1.print();

        c1.GearChange(3);
        c1.SpeedIncrease(15);
        c1.Breaks(50);
        c1.print();

    }
}
