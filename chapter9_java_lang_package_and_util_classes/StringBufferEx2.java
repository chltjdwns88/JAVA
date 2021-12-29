class StringBufferEx2{
    public static void main(String[] argv){
        StringBuffer sb1 = new StringBuffer("01");
        StringBuffer sb2 = sb1.append(23);

        System.out.println(sb1);
        sb1.deleteCharAt(1);
        System.out.println(sb1);
        sb1.insert(1, 1);
        System.out.println(sb1);
    }
}