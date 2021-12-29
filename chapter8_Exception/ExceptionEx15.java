import java.io.*;

class ExceptionEx15{
    public static void main(String[] argv){
        File f = createFile(argv[0]);
    }
    static File createFile(String fileName){
        try{
            if(fileName == null || fileName.equals("")){
                throw new Exception("not proper for fileName!!");
            }
        }catch(Exception error){
            System.out.println("error! occured! i will write title myself!");
            fileName = "No_Title.txt";
        }finally{
            File f = new File(fileName);
            createFile(f);
            return f;
        }
    }
    static void createFile(File f){
        try{
            f.createNewFile();
        }catch(Exception e){

        }
    }
}
