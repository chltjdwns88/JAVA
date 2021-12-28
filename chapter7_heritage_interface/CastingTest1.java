class CastingTest1{
    public static void main(String[] argv){
        Car car = null;
        FireEngine Fe1 = new FireEngine();
        FireEngine Fe2 = null;

        Car car2 = new FireEngine();
        // 에러!!  FireEngine car3 = new Car();
        Fe1.water();
        car = Fe1;

        // car.water();  car타입의 참조변수로는 water()를 호출 할 수 없다!

        Fe2 = (FireEngine)car;
        Fe2.water();
        Fe2.drive();
    }
}

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("Drive!");
    }

    void stop(){
        System.out.println("Stop!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("Water!");
    }
}