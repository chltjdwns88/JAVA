class CardToString2{
    public static void main(String[] argv){
        Card c1 = new Card();
        Card c2 = new Card("DIAMOND", 10);

        System.out.println(c1);
        System.out.println(c1.toString());
        System.out.println(c2);
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

    public String toString(){
        return "kind : " + kind + " number : " + number;
    }
}