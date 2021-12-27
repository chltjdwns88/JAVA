import java.util.*;

class FlowEx2{
    public static void main(String[] argv){

        System.out.print("input any integer!>");
        
        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();

        int input = Integer.parseInt(temp);
        
        if(input == 0){
            System.out.println("interger == 0");
        }
        
        if(input != 0){
            System.out.println("interger != 0");
        }
    }
}