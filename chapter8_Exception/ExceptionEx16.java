import java.io.*;

class ExceptionEx16{
    public static void main(String[] argv){
        try{
            File f = createFile(argv[0]);
            System.out.println(argv[0] + " success to create file!");
        }catch(Exception e){
            System.out.println(e.getMessage() + " please try again!");
        }
    }
    static File createFile(String fileName)throws Exception{
        if(fileName == null || fileName == ""){
            throw new Exception("fileName == null or empty space");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}