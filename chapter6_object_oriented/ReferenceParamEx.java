class ReferenceParamEx{
    public static void main(String[] argv){
        DATA d = new DATA();
        d.a = 10;
        System.out.println("d.a : " + d.a);
        change(d);
        System.out.println("d.a : " + d.a);
    }
    static void change(DATA v){
        v.a = 1000;
    }
}

class DATA{int a;}