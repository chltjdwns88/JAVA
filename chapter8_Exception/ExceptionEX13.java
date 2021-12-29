class ExceptionEx13{
    public static void main(String[] argv){
        method();
    }

    static void method(){
        try{
            throw new Exception("error!");
        }catch(Exception e){
            System.out.println("error! occur in method()");
            System.out.println(e.getMessage());
        }
    }
}