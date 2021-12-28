class CarTest{
    public static void main(String[] argv){
        Car C1 = new Car();
        C1.color = "white";
        C1.gearType = "manual";
        C1.door = 4;

        Car C2 = new Car("black", "auto", 2);

        System.out.println("C1 : " + C1.color + " " + C1.gearType + " " + C1.door);
        System.out.println("C2 : " + C2.color + " " + C2.gearType + " " + C2.door);
    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car(){}
    Car(String c_color, String c_gearType, int c_door){
        color = c_color;
        gearType = c_gearType;
        door = c_door;
    }
}