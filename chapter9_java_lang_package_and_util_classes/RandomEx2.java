import java.util.*;

class RandomEx2{
    public static void main(String[] argv){
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];

        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] = rand.nextInt(10));   // 0 ~ 9 숫자랜덤생성
        }
        System.out.println();

        for(int i = 0; i < number.length; i++){
            counter[number[i]]++;
        }

        for(int i = 0; i < counter.length; i++){
            System.out.print(counter[i] + " ");
        }
    }
}