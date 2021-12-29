class HashCodeEx1{
    public static void main(String[] argv){
        String str1 = new String("abc");
        String str2 = new String("abc");
        int a = 10;
        int b = 10;
        System.out.println(a == b);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}