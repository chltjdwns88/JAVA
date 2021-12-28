class FactorialTest{
    public static void main(String[] argv){
        System.out.println("Factorial(" + 5 + ") = " + Factorial(5));
    }
    static int Factorial(int n){
            int result = 0;
            if(n == 1){return 1;}
            else{
                result = n * Factorial(n-1);
            }
            return result;
    }
}