import java.util.*;

class IteratorEx1{
    public static void main(String[] argv){
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator iter = list.iterator();
        while(iter.hasNext()){
            Object obj = iter.next();
            System.out.println(obj);
        }
    }
}