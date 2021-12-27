import java.util.*;

class FlowEx25{
    public static void main(String[] argv){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number ex(12345)>");
        String temp = scanner.nextLine();
        int num = Integer.parseInt(temp);


        while(num != 0){
            sum += num % 10;
            System.out.printf("%5d %5d\n", sum, num);
            num = num / 10;
        }
    }
}