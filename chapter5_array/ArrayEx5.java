class ArrayEx5{
    public static void main(String[] argv){
        int sum = 0;
        float average = 0f;
        
        int[] score = {100, 95, 97, 90, 100};
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        average = sum / (float)score.length;
        System.out.println("total sum : " + sum);
        System.out.println("average : " + average);
    }
}