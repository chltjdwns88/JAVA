class StaticBlockTest{
    public static void main(String[] argv){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

    static int[] arr = new int[10];

    static{
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
        }
    }
}