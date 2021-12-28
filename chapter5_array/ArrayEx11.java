import java.util.*;

class ArrayEx11{
    public static void main(String[] argv){
        int[] array = new int[10];
        int[] counter = new int[array.length];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
        }

        for(int i = 0; i < array.length; i++){
            counter[array[i]]++;
        }
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < counter.length; i++){
            System.out.printf("%d 's count : %d\n", i, counter[i]);
        }
    }
}