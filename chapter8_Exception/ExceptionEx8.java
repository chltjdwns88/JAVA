class ExceptionEx8{
    public static void main(String[] argv){
        System.out.println(1);
        try{
            System.out.println(3/0);
        }catch(ArithmeticException ae){
            System.out.println("true");
            // ae.printStackTrace(); 복잡함
            System.out.println("error message : " + ae.getMessage()); //단순해서 좋음
        }
        System.out.println("finish!");
    }
}