class FinalCardTest{
    public static void main(String[] argv){
        Card c = new Card("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}

class Card{
    final int NUMBER;
    final String KIND;

    static int height = 100;
    static int weight = 250;

    Card(String KIND, int NUMBER){
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    Card(){
        this("HEART", 1);
    }

    public String toString(){
        return KIND + " " + NUMBER;
    }
    // 클래스에서 그냥 객체를 출려갈 시 toString 이 출력된다.
}