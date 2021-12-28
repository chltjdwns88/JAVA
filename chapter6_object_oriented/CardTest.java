class CardTest{
    public static void main(String[] argv){
        System.out.printf("now Card's width and height = %d %d\n", Card.width, Card.height);
        Card c1 = new Card();
        Card c2 = new Card();

        c1.num = 7;
        c1.kind = "diamond";

        c2.num = 10;
        c2.kind = "heard";

        System.out.printf("c1!! num : %d  kind : %s\n", c1.num, c1.kind);
        System.out.printf("c2!! num : %d  kind : %s\n", c2.num, c2.kind);

        c1.width = 10;
        c1.height = 20;
        System.out.println("c1's width and height is changed!!");
        System.out.printf("c1's width and height : %d %d\n", c1.width, c1.height);
        System.out.printf("c2's width and height : %d %d\n", c2.width, c2.height);
    }
}

class Card{
    int num;
    String kind;
    static int width = 150;
    static int height = 200;
}