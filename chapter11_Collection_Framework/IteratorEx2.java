import java.util.*;

class IteratorEx2{
    public static void main(String[] argv){
        ArrayList origin = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for(int i = 0; i < 10; i++){
            origin.add(i);
        }

        Iterator iter = origin.iterator();

        while(iter.hasNext()){
            copy1.add(iter.next());
        }

        System.out.println("Origin -> copy1");
        System.out.println(origin);
        System.out.println(copy1);

        iter = origin.iterator();

        while(iter.hasNext()){
            copy2.add(iter.next());
            iter.remove();
        }

        System.out.println("Origin -> copy2");
        System.out.println(origin);
        System.out.println(copy2);
    }
}