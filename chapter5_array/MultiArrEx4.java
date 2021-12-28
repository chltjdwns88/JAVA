import java.util.*;

class MultiArrEx4{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        
        String[][] question = {
            {"1", "One"},
            {"2", "Two"},
            {"3", "Three"}
        };

        for(int i = 0; i < question.length; i++){
            System.out.printf("Q%d %s's english word? ex(4 : Four)>", i+1, question[i][0]);
            String temp = scanner.nextLine();
            if(temp.equals(question[i][1])){
                System.out.println("Correct!!");
            }
            else{
                System.out.printf("WRON! ANSWER : %s\n", question[i][1]);
            }
        }
    }
}