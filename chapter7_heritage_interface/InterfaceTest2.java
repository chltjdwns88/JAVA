class InterfaceTest2{
    public static void main(String[] argv){
        A a = new A();
        a.autoplay(new B());
        a.autoplay(new C());
    }
}

interface I{
    public abstract void play();
}

class A{
    public void autoplay(I i){
        i.play();
    }
}

class B implements I{
    public void play(){
        System.out.println("class B play()");
    }
}

class C implements I{
    public void play(){
        System.out.println("class C play()");
    }
}