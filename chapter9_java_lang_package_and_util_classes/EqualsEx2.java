class EqualsEx2{
    public static void main(String[] argv){
        Person p1 = new Person(1234L);
        Person p2 = new Person(1234L);

        System.out.println(p1 == p2); //객체와 객체가 서로 다른 주소값을 가지는 값이기 때문에 false
        System.out.println(p1.equals(p2)); //equals 메소드를 값만 비교하도록 오버라이딩 했기 때문에 값만 비교 가능 원래라면 false
    }
}

class Person{
    long id;
    Person(long id){
        this.id = id;
    }
    public boolean equals(Object obj){
        if(obj != null && (obj instanceof Person)){
            return this.id == ((Person)obj).id;
        }else{
            return false;
        }
    }
}