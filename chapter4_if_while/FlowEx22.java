class FlowEx22{
    public static void main(String[] argv){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        int sum1 = 0;
        for(int a : arr){
            sum += a;
        }
        for(int b = 0; b < arr.length; b++){
            sum1 += arr[b];
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}