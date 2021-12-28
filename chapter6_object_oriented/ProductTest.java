class ProductTest{
    static int count = 0;
           int serialNum;
    {
        count++;
        serialNum = count;
    }
    public static void main(String[] argv){
        ProductTest p1 = new ProductTest();
        ProductTest p2 = new ProductTest();
        ProductTest p3 = new ProductTest();

        System.out.printf("p1 serialNum : %d\n", p1.serialNum);
        System.out.printf("p2 serialNum : %d\n", p2.serialNum);
        System.out.printf("p3 serialNum : %d\n", p3.serialNum);
    }
}