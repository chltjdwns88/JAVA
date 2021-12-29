class ExceptionEx3{
    public static void main(String[] argv){
        int number = 100;
        int result = 0;

        for(int i = 0; i < 100; i++){
            try{
                result = number / (int)(Math.random() * 10);
                System.out.println(result);
            }catch(ArithmeticException e){
                System.out.println("error!! random num : 0");
            }
        }
    }
}