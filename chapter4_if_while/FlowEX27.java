import java.util.*;

class FlowEx27{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number (stop number = 0)");
        boolean flag = true;
        int sum = 0;
        while(flag){
            System.out.print("enter number>");
            String temp = scanner.nextLine();
            int num = Integer.parseInt(temp);
            if(num != 0){
                sum += num;
            }
            else{
                flag = false;
            }
        }
        System.out.println(sum);
    }
}