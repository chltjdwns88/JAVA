class ArrayEx6{
    public static void main(String[] argv){
        int[] score = {100, 90, 95, 98, 100};

        int max = score[0];
        int min = score[0];
        for(int i = 1; i < score.length; i++){
            if(max < score[i]){max = score[i];}
            else if(min > score[i]){min = score[i];}
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}