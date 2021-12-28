class ReferenceReturnEx{
    public static void main(String[] argv){
        Data d1 = new Data();
        d1.x = 10;
        
        Data d2 = copy(d1);
        System.out.println("d1.x = " + d1.x);
        System.out.println("d2.x = " + d2.x);
        d2.x = 20;
        System.out.println("d1.x = " + d1.x);
        System.out.println("d2.x = " + d2.x);
    }
    static Data copy(Data v){
        Data temp = new Data();
        temp.x = v.x;
        return temp;
    }
}

class Data{int x;}