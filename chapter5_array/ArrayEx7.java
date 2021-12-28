import java.util.*;
class ArrayEx7{
    public static void main(String[] argv){
        int[] num = new int[10];
        for(int i = 0; i < num.length; i++){
            num[i] = i;
            System.out.print(num[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < 100; i++){
            int n = (int)(Math.random() * 10);
            int temp = num[n];
            num[n] = num[i % 10];
            num[i % 10] = temp;
        }
        System.out.println(Arrays.toString(num));
    }
}