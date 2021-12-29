// equals 메소드는 두 객체의 주소값으로 비교한다
class EqualsEx1{
    public static void main(String[] argv){
        Value a = new Value(10);
        Value b = new Value(10);

        if(a.equals(b)){
            System.out.println("a == b");
        }else{
            System.out.println("a != b");
        }

        a = b;

        if(a.equals(b)){
            System.out.println("a == b");
        }else{
            System.out.println("a != b");
        }
    }
}

class Value{
    int value;

    Value(int value){
        this.value = value;
    }
}