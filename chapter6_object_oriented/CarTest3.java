class CarTest3{
    public static void main(String[] argv){
        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.printf("c1's option : %s %s %d\n", c1.color, c1.gearType, c1.door);
        System.out.printf("c2's option : %s %s %d\n", c2.color, c2.gearType, c2.door);
        c2.gearType = "anything";
        System.out.printf("c1's option : %s %s %d\n", c1.color, c1.gearType, c1.door);
        System.out.printf("c2's option : %s %s %d\n", c2.color, c2.gearType, c2.door);

    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(Car c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}