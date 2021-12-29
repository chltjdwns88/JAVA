import java.util.*;

class CloneEx2{
    public static void main(String[] argv){
        int[] arr1 = {1, 2, 3, 4, 5};    // 배열도 객체이기 때문에 object 클래스를 상속받으며 cloneable 인터페이스가 구현되어 있다
        int[] arr2 = arr1.clone();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr2[0] = 6;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1[2] = 100;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}