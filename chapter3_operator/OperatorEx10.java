class OperatorEx10{
    public static void main(String[] argv){
        int a = 100000;
        // int result1 = a * a / a;  에러발생!!  a*a(오브플로우된값이 먼저 연산) / a ==> 에러발생
        int result2 = a / a * a;
        System.out.println(result2);
    }
}