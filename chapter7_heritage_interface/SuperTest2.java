class SuperTest2{
    public static void main(String[] argv){
        Child c = new Child();
        c.show_variable();
    }
}

class Parent{
    int x = 0;

    void show_variable(){
        System.out.println(x);
    }
}

class Child extends Parent{
    int x = 1;
    void show_variable(){
        System.out.println("super.x : " + super.x);
        System.out.println("this.x : " + this.x);
    }
}