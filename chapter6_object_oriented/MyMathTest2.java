class MyMathTest2{
    public static void main(String[] argv){
        System.out.println("3 + 2 = " + MyMath.add(3, 2));
        System.out.println("3 - 2 = " + MyMath.subtract(3, 2));
        System.out.println("3 * 2 = " + MyMath.multiply(3, 2));
        System.out.println("3 / 2 = " + MyMath.divide(3, 2));

        MyMath mm = new MyMath();
        mm.a = 30;
        mm.b = 20;

        System.out.println("30 + 20 = " + mm.add());
        System.out.println("30 - 20 = " + mm.subtract());
        System.out.println("30 * 20 = " + mm.multiply());
        System.out.println("30 / 20 = " + mm.divide());
    }
}

class MyMath{
    int a, b;

    int add(){return a+b;}
    int subtract(){return a-b;}
    int multiply(){return a*b;}
    double divide(){return a/(double)b;}

    static int add(int a, int b){return a+b;}
    static int subtract(int a, int b){return a-b;}
    static int multiply(int a, int b){return a*b;}
    static double divide(int a, int b){return a/(double)b;}
}
