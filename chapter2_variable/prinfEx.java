class prinfEx{
    public static void main(String[] argv){
        int num = 8;
        char c = 'A';
        String temp = "hi i am sungjune";
        System.out.printf("bi_num = %s\n", Integer.toBinaryString(num));
        System.out.printf("c = %c, number = %d\n",c, (int)c);
        System.out.printf("name = %.8s\n", temp);
    }
}