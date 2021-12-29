class CardToString{
    public static void main(String[] argv){
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());  // toString 을 오버라이딩 하지 않을 시엔    클래스이름 + "@" + hashcode
        System.out.println(c2.toString());
    }
}

class Card{
    String kind;
    int number;
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
    Card(){
        this("HEART", 7);
    }
}