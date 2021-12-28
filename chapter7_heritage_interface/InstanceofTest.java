class InstanceofTest{
    public static void main(String[] argv){
        FireEngine Fe = new FireEngine();
        if(Fe instanceof FireEngine){
            System.out.println("instance of FireEngine");
        }

        if(Fe instanceof Car){
            System.out.println("instance of Car");
        }

        if(Fe instanceof Object){
            System.out.println("instance of Object");
        }

        System.out.println(Fe.getClass().getName());
    }
}

class Car{}
class FireEngine extends Car{}