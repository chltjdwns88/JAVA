class InnerEx1{
    class InstanceInner{
        int iv = 1000;
        //static int cv = 1000; 에러!! static 클래스 내부에서만 static 사용 가능
        final static int CONST = 100; // final static 은 상수로써 사용 가능
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 200;
    }

    void Mymethod(){
        class LocalInner{
            int iv = 300;
            //static int cv = 200; static 클래스에서만 static 사용가능
            final static int CONST = 300;
        }
    }
    public static void main(String[] argv){
        System.out.println(InstanceInner.CONST);
        System.out.println(LocalInner.CONST);
        System.out.println(StaticInner.cv);
    }
}

