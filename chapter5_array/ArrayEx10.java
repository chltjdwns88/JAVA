import java.util.*;

class ArrayEx10{
    public static void main(String[] argv){
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100) + 1;
        }        
        System.out.println(Arrays.toString(array));

        for(int i = array.length - 1; i > 0; i--){
            boolean flag = false;
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){break;}
        }
        System.out.println(Arrays.toString(array));
    }
}