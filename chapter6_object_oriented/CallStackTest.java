class CallStackTest{
    public static void main(String[] argv){
        System.out.println("main start");
        firstmethod();
        System.out.println("main end");
    }
    static void firstmethod(){
        System.out.println("first start");
        secondmethod();
        System.out.println("first end");
    }
    static void secondmethod(){
        System.out.println("second start");
        System.out.println("second end");
    }
}