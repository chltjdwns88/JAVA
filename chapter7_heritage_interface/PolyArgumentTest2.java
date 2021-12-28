class PolyArgumentTest2{
    public static void main(String[] argv){
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
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
    Product[] itemlist = new Product[10];
    int i = 0;

    void buy(Product p){
        if(p.price > money){
            System.out.println("error! not enough money!");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        itemlist[i++] = p;
        System.out.println("success to buy it!" + p);
    }

    void summary(){
        int sum = 0;
        String itemlist_name = "";
        for(int i = 0; i < itemlist.length; i++){
            if(itemlist[i] == null){break;}
            sum += itemlist[i].price;
            itemlist_name += (i == 0) ? itemlist[i] : ", " + itemlist[i];
        }
        System.out.println("total price : " + sum);
        System.out.println("itemlist : " + itemlist_name);
    }
}