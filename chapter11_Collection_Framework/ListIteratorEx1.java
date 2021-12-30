import java.util.*;

class ListIteratorEx1{
    public static void main(String[] argv){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator iter = list.listIterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println();

        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
        System.out.println();
    }
}