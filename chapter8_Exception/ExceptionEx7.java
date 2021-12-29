class ExceptionEx7{
    public static void main(String[] argv){
        try{
            System.out.println(1);
            System.out.println(3/0);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException!");
        }catch(Exception a){
            System.out.println("Exception!");
        }
    }
}