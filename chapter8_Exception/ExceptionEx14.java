class ExceptionEx14{
    public static void main(String[] argv){
        try{
            method();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void method() throws Exception{
        throw new Exception("error! in method()");
    }
}