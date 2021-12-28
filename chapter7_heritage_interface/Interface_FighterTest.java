class Interface_FighterTest{
    public static void main(String[] argv){
        Fighter f = new Fighter();

        if(f instanceof Unit){
            System.out.println("Unit class's son f");
        }
        if(f instanceof Fightable){
            System.out.println("Fightable class's son f");
        }
        if(f instanceof Movable){
            System.out.println("Movable class's son");
        }
        if(f instanceof Attackable){
            System.out.println("Attackable class's son");
        }
        if(f instanceof Object){
            System.out.println("Object class's son");
        }
    }
}

class Unit{
    int currentHp;
    int x;
    int y;
}

interface Attackable{
    void attack(Unit u);
}

interface Movable{
    void move(int x, int y);
}

interface Fightable extends Movable, Attackable{}

class Fighter extends Unit implements Fightable{
    public void attack(Unit u){}
    public void move(int x, int y){}
}
