interface playingcard{
    public static final int SPADE = 4; // 멤버변수는 자동으로 public static final type 변수명 = 값;
    final int DIAMOND = 5; // 자동으로 public static final int Diamond = 4; 가 생성
    static int CLOVER = 6; // public static final int CLOVER = 6;
    int HEART = 2; //public static final int HEART = 2;

    public abstract String cardname(); // 메서드는 public abstract type 이름();
    String getcardname(); // 자동으로 public abstract String getcardname();
}


// 모든 인터페이스는 인터페이스로부터만 상속이 가능하다. 또한 다중상속 가능


interface 는 상속의 의미인 extends 대신 implements를 사용한다.

class 클래스이름 implements 인터페이스이름{
    // 인터페이스에 정의된 추상메서드를 구현
}

또한 동시 가능

class 클래스이름 extends ex1 implements ex2{
    
}