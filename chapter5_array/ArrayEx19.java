import java.util.*;

class ArrayEx19{
    public static void main(String[] argv){
        int[][] score = {
            {100, 100, 100},
            {20, 20, 20},
            {30, 30, 30},
            {40, 40, 40},
            {50, 50, 50}
        };

        int KorTotal = 0;
        int EngTotal = 0;
        int MathTotal = 0;

        System.out.println("Num Kor Eng Math Total Average");
        System.out.println("--------------------------------");

        for(int i = 0; i < score.length; i++){
            KorTotal += score[i][0];
            EngTotal += score[i][1];
            MathTotal += score[i][2];
            System.out.printf("%3d", i + 1);
            int sum = 0;
            for(int j = 0; j < score[i].length; j++){
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            System.out.printf("%5d %5.1f\n", sum, sum / 3.0);
        }
        System.out.printf("total : %5d %5d %5d", KorTotal, EngTotal, MathTotal);
    }
}