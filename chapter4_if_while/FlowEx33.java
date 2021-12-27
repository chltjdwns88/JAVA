class FlowEx33{
    public static void main(String[] argv){
        Loop1 : for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(j == 2){
                    break Loop1;
                }
                System.out.printf("%d x %d = %d ", i, j, i*j);
            }
            System.out.println();
        }
    }
}