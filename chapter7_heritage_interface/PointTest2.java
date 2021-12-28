class PointTest2{
    public static void main(String[] argv){
        Point3D p3 = new Point3D();
    }
}

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point{
    int z;

    Point3D(){
        this(100, 200, 300);
    }
    
    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}