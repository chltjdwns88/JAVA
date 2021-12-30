import java.util.*;

class VectorEx1{
    public static void main(String[] argv){
        Vector v = new Vector(5);   //벡터 5칸 생성
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        System.out.println(v);
        System.out.println(v.size() + " " + v.capacity()); // size = 들어가있는 용량  capacity = 총 용량
        v.trimToSize(); // 빈 공간 없앰
        System.out.println(v.size() + " " + v.capacity());

        v.ensureCapacity(10); // 10이라는 공간으로 확장
        System.out.println(v.size() + " " + v.capacity());

        v.setSize(7);  // 들어있는 요소 제외하고 null값으로 size를 늘림   *capacity부족할경우 자동으로 2배 증가
        System.out.println(v.size() + " " + v.capacity());

        v.clear();  //초기화   size만
        System.out.println(v.size() + " " + v.capacity());
    }
}