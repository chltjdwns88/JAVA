import java.util.*;

class FlowEx28{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100) + 1;
        int temp_answer = 0;
        do{
            System.out.print("enter answer>");
            String temp = scanner.nextLine();
            temp_answer = Integer.parseInt(temp);
            if(temp_answer > answer){
                System.out.println("lower!");
            }
            else if(temp_answer < answer){
                System.out.println("upper!");
            }
        }while(temp_answer != answer);
        System.out.println("congratulation!");
    }
}