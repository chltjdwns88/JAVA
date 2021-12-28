class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class Tvtest{
    public static void main(String[] argv){
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("now channel " + t.channel);
    }
}