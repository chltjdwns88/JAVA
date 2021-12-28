class InterfaceTest3{
    public static void main(String[] argv){
        A a = new A();
        a.methodA();
    }
}

interface I{
    public abstract void methodB();
}

class B implements I{
    public void methodB(){
        System.out.println("methodB()");
    }
    public String toString(){
        return "Class B";
    }
}

class A{
    void methodA(){
        I i = InstanceManager.getinstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

class InstanceManager{
    public static I getinstance(){
        return new B();
    }
}