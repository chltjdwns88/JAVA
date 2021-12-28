class ConstructorTest{
    public static void main(String[] argv){
        DATA1 d1 = new DATA1();
        // DATA2 d2 = new DATA2();  ==> 에러발생 DATA2 클래스는 생성자가 매개변수 1개인 생성자로 생성되었기 떄문에! 각 클래스에 생성자가 미리 정의되어있으면 기본생산자는 만들어지지 않는다.
        DATA2 d2 = new DATA(2);
    }
}

class DATA1{
    int x;
}

class DATA2{
    int x;
    DATA2(int temp){
        x = temp;
    }
}