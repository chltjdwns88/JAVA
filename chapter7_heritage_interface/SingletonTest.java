class SingletonTest{
    public static void main(String[] argv){
        // 에러!!  Singleton s = new Singleton(); 
        Singleton s = Singleton.getInstance();
        Singleton j = Singleton.getInstance();
    }
}

final class Singleton{
    private static Singleton s = new Singleton();
    
    private Singleton(){
        System.out.println("hi!!");
    }

    public static Singleton getInstance(){
        if(s == null){
            s = new Singleton();
            return s;
        }
        else{
            return s;
        }
    }
}