class InnerEx5{
    public static void main(String[] argv){
        Outer out = new Outer();
        Outer.Inner outin = out.new Inner();
        outin.method();
    }
}

class Outer{
    int value = 10;
    class Inner{
        int value = 20;
        void method(){
            int value = 30;
            System.out.println("           value : " + value);
            System.out.println("      this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer.this.value);
        }
    }
}