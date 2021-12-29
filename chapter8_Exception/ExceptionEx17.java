class ExceptionEx17{
    public static void main(String[] argv){
        try{
            method();
        }catch(Exception e){
            System.out.println("clear at main()");
        }
    }
    static void method()throws Exception{
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println("clear at method()");
            throw e;
        }
    }
}