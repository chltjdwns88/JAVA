class ArrayEx14{
    public static void main(String[] argv){
        String str = "ABCDE";

        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            System.out.println("str[" + i + "] = " + temp);
        }

        char[] array = str.toCharArray();

        System.out.println(array);
    }
}