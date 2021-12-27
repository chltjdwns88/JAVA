import java.util.*;

class FlowEx5{
    public static void main(String[] argv){
        int score = 0;
        char grade = ' ';
        char opt = '0';
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your score>");
        String temp = scanner.nextLine();
        score = Integer.parseInt(temp);
        System.out.printf("your score : %d\n", score);

        if(score >= 90){
            grade = 'A';
            if(score >= 98){
                opt = '+';
            }
            else if(score < 94){
                opt = '-';
            }
        }else if(score >= 80){
            grade = 'B';
            if(score >= 88){
                opt = '+';
            }
            else if(score < 84){
                opt = '-';
            }
        }
        System.out.printf("your grade : %c%c\n", grade, opt);
    }
}