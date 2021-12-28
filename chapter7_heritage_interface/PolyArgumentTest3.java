import java.util.*;

class PolyArgumentTest3{
    public static void main(String[] argv){
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Audio audio = new Audio();
        Computer computer = new Computer();
        Computer computer2 = new Computer();
        b.buy(tv);
        b.buy(audio);
        b.buy(computer);
        b.buy(computer2);
        b.summary();

        System.out.println();
        b.refund(computer);
        b.refund(computer);
        b.summary();
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

class Audio extends Product{
    Audio(){
        super(30);
    }
    public String toString(){
        return "Audio";
    }
}

class Computer extends Product{
    Computer(){
        super(300);
    }
    public String toString(){
        return "Computer";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Vector item_list = new Vector();
    int i = 0;

    void buy(Product p){
        if(p.price > money){
            System.out.println("error! not enough money!");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item_list.add(p);
        System.out.println("success to buy it!" + p);
    }

    void refund(Product p){
        if(item_list.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println("success to refund " + p + "!!");
        }
        else{
            System.out.println("fail to refund " + p + "!!");
        }
    }

    void summary(){
        int sum = 0;
        String itemlist_name = "";
        if(item_list.isEmpty()){
            System.out.println("item list is empty!");
            return;
        }

        for(int i = 0; i < item_list.size(); i++){
            Product p = (Product)item_list.get(i);
            sum += p.price;
            itemlist_name += (i==0) ? p : ", " + p; 
        }
        System.out.println("total price : " + sum);
        System.out.println("itemlist : " + itemlist_name);
    }
}

// Vector vector = new Vector();
// boolean add(Object o);
// boolean remove(Object o);
// Object get(int index);
// boolean isEmpty();
// int     size();