class InnerEx4{
    public static void main(String[] argv){
        Outer out = new Outer();
        Outer.InstanceInner ii = out.new InstanceInner();
        System.out.println(ii.iv);

        System.out.println(Outer.StaticInner.cv);

        Outer.StaticInner os = new Outer.StaticInner();
        System.out.println(os.iv);
    }
}

class Outer{
    class InstanceInner{
        int iv = 100;
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }

    void myMethod(){
        class LocalInner{
            int iv = 400;
        }
    }
}