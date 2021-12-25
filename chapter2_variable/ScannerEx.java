import java.util.*;

class ScannerEx{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter integer more than 10 !>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.print("input value : " + input + "\n");
        System.out.printf("num = %d%n", num);
    }
}