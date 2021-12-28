import java.util.*;

class MultiArrEx2{
    public static void main(String[] argv){
        final int SIZE = 5;
        Scanner scanner = new Scanner(System.in);

        int[][] Bingo = new int[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                Bingo[i][j] = SIZE * i + j + 1;
            }
        }
        
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                int x = (int)(Math.random() * SIZE);
                int y = (int)(Math.random() * SIZE);
                int temp = Bingo[x][y];
                Bingo[x][y] = Bingo[i][j];
                Bingo[i][j] = temp; 
            }
        }

        while(true){
            for(int i = 0; i < SIZE; i++){
                for(int j = 0; j < SIZE; j++){
                    System.out.printf("%5d", Bingo[i][j]);
                }
                System.out.println();
            }
            System.out.print("enter bingo number ex)5 (exit>0)>");
            String temp = scanner.nextLine();
            int x = Integer.parseInt(temp);
            if(!(0 <= x && x <= 25)){
                System.out.println("error! please try again!");
                continue;
            }

            outer:
            for(int i = 0; i < SIZE; i++){
                for(int j = 0; j < SIZE; j++){
                    if(Bingo[i][j] == x){
                        Bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        }        
    }
}