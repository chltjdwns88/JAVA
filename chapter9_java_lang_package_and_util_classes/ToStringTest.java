class ToStringTest{
    public static void main(String[] argv){
        String str1 = "KOREA";
        java.util.Date today = new java.util.Date();

        System.out.println(str1);
        System.out.println(str1.toString());
        System.out.println(today);
        System.out.println(today.toString());   // String 클래스와 Date 클래스 모두 toString 이 오버라이딩 되어있으므로 이렇게 출력
    }
}