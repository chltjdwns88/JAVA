class MyMathTest{
    public static void main(String[] argv){
        MyMath mm = new MyMath();
        System.out.println("1 + 2 = " + mm.add(1, 2));
        System.out.println("1 - 2 = " + mm.subtract(1, 2));
        System.out.println("1 * 2 = " + mm.multiply(1, 2));
        System.out.println("1 / 2 = " + mm.divide(1, 2));
    }
}

class MyMath{
    int add(int a, int b){return a+b;}
    int subtract(int a, int b){return a-b;}
    int multiply(int a, int b){return a*b;}
    double divide(int a, int b){return a / (double)b;}
}