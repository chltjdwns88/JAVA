class OperatorEx32{
    public static void main(String[] argv){
        int x, y, z;
        int absx, absy, absz;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;
        
        absx = x >= 0 ? x : -x;
        absy = y >= 0 ? y : -y;
        absz = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("absx : %c%d%n", signX, absx);
        System.out.printf("absy : %c%d%n", signY, absy);
        System.out.printf("absz : %c%d%n", signZ, absz);
    }
}