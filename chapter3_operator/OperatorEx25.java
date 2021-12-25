import java.util.*;

class OperatorEx25{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        char a = ' ';

        System.out.print("insert!(one) >");

        String input = scanner.nextLine();

        a = input.charAt(0);
        if('0' <= a && a <= '9'){
            System.out.println("integer!.\n");
        }

        if(('a' <= a && a <= 'z') || ('A' <= a && 'Z' <= a)){
            System.out.println("charactor.\n");
        }
    }
}