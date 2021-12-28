class MemberCall{
    public static void main(String[] argv){

    }
}

class Member{
    int iv = 10;
    static int cv = 20;

    int iv2 = cv; //인스턴스는 클래스변수 사용가능
    //static int cv2 = iv  클래스변수는 인스턴스 변수 사용 불가능
    static int cv2 = new Member().iv; // 이처럼 객체를 생성해야 인스턴스 변수 사용 가능


    static void staticMethod1(){
        System.out.println(cv);
        // System.out.println(iv);  사용불가능!  iv는 인스턴스 변수이기떄문에 클래스 메소드가 생성되어도 생성 안되어있을 가능성이 있기때문에.
        Member c = new Member();
        System.out.println(c.iv); // 이처럼 객체 생성후엔 인스턴스 변수 사용가능
    }

    void instanceMethod1(){
        System.out.println(iv);  // 인스턴스 메소드는 인스턴스 변수 및 클래스 변수 둘다 사용가능
        System.out.println(cv);
    }

    static void staticMethod2(){
        staticMethod1(); // 클래스 메소드 사용가능
        // instanceMethod1(); 클래스 메소드에서 인스턴스 메소드 사용 불가능
        Member c = new Member();
        c.instanceMethod1(); // 객체 생성후에는 인스턴스 메소드 사용가능
    }

    void instanceMethod2(){
        staticMethod1();
        instanceMethod1(); // 인스턴스 메소드는 인스턴스 메소드 및 클래스 메소드 둘다 사용 가능 
    }
}