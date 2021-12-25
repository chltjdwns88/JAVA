class OperatorEx23{
    public static void main(String[] argv){
        String str = new String("abc");
        String str1 = "abc";
        boolean temp = str.equals(str1);
        boolean temp1 = (str1 == str);
        System.out.println(temp);
        System.out.println(temp1);
    }
}

// java 에서 문자열 비교할때는 무조건 equals 