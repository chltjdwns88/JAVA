class PolyArgumentTest{
    public static void main(String[] argv){
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("remain money : " + b.money);
        System.out.println("bonus point : " + b.bonusPoint);
    }
}

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price / 10.0);
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(p.price > money){
            System.out.println("not enough money!");
            return;
        }
        this.money = this.money - p.price;
        this.bonusPoint = this.bonusPoint + p.bonusPoint;
        System.out.println("buy it! " + p);
    }
}