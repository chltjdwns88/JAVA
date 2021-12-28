import java.util.*;
class ArrayEx3{
    public static void main(String[] argv){
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = i+1;
        }
        System.out.println("before length : " + array.length);
        System.out.println(Arrays.toString(array));

        int[] temp = new int[array.length * 2];
        for(int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        array = temp;
        System.out.println("after length : " + array.length);
        System.out.println(Arrays.toString(array));
    }
}