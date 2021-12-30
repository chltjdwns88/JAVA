import java.util.*;

class ArrayListEx1{
    public static void main(String[] argv){
        ArrayList list1 = new ArrayList(10);

        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1 1, 2, 3 index 값 복사저장
        System.out.println(list2);
        list2.add("B");
        list2.add("hi hello");
        System.out.println(list2);
        list2.add(0, "first");
        System.out.println(list2);
        System.out.println(list1.retainAll(list2));  //겹치는거 빼고 다 삭제
        System.out.println(list1);
        System.out.println(list2);

        for(int i = list2.size()-1; i >= 0; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        System.out.println(list2);
    }
}