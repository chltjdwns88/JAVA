class CarTest2{
    public static void main(String[] argv){
        Car c1 = new Car();
        Car c2 = new Car("White");
        Car c3 = new Car("black", "auto-manual", 4);

        System.out.printf("c1's option : %s %s %d\n", c1.color, c1.gearType, c1.door);
        System.out.printf("c2's option : %s %s %d\n", c2.color, c2.gearType, c2.door);
        System.out.printf("c3's option : %s %s %d\n", c3.color, c3.gearType, c3.door);
    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("blue", "manual", 4);
    }

    Car(String c_color){
        this(c_color, "auto", 2);
    }

    Car(String c_color, String c_gearType, int c_door){
        color = c_color;
        gearType = c_gearType;
        door = c_door;
    }
}