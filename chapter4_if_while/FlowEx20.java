class FlowEx20{
    public static void main(String[] argv){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == j){
                    System.out.printf("[%d, %d]", i, j);
                }
                else{
                    System.out.printf("%7c", ' ');
                }
            }
            System.out.println();
        }
    }
}