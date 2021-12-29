class CloneEx1{
    public static void main(String[] argv){
        Point original = new Point(3, 3);
        Point copy = original.clone();
        System.out.println(original);
        System.out.println(copy);
        System.out.println(original == copy);
        System.out.println(original.equals(copy));
        original.x = 4;
        original.y = 5;
        copy.x = 100;
        copy.y = 200;
        System.out.println(original);
        System.out.println(copy);
    }
}

class Point implements Cloneable{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(3, 3);
    }
    public String toString(){
        return "x : " + x + " y : " + y; 
    }
    // public Object clone() 을 return 에 형변환 해주는 것으로 변경 보기좋음
    public Point clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){}
        return (Point)obj;
    }
}