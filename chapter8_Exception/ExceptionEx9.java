class ExceptionEx9{
    public static void main(String[] argv){
        try{
            Exception e = new Exception("go error!!");
            throw e;
            // 1줄로 throw new Exception("go error!!");
        }catch(Exception e){
            // e.printStackTrace();
            System.out.println("why occur error! : " + e.getMessage());
        }
    }
}