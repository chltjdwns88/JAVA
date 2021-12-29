class FinallyTest{
    public static void main(String[] argv){
        System.out.println("main start!");
        FinallyTest.method();
        method();
    }
    static void method(){
        try{
            System.out.println("method() try start!");
            return;
        }catch(Exception e){
            System.out.println("method() catch start!");
        }finally{
            System.out.println("method() finally start!");
        }
    }
}
// return 문을 만나더라도 finally 문장들은 실행됨