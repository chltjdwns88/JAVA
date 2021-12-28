import java.util.*;

class MultiArrEx1{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        int index = 0;
        int person1_point = 0;
        int person2_point = 0;
        int x = 0, y = 0;
        
        char[][] cur_ship_point = new char[SIZE][SIZE];

        for(int i = 0; i < SIZE; i++){
            cur_ship_point[i][0] = cur_ship_point[0][i] = (char)(i + '0');
            for(int j = 1; j < SIZE; j++){
                cur_ship_point[i][j] = ' ';
            }
        }

        int[][] ship_point = {
            {0, 1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 1}
        };
        
        while(true){
            System.out.print("enter ship_point ex)13 (exit>00)>");
            String temp = scanner.nextLine();
            
            if(temp.equals("00")){
                System.out.println("person1 = " + person1_point);
                System.out.println("person2 = " + person2_point);
                break;
            }

            if(temp.length() == 2){
                x = (temp.charAt(0) - '0');
                y = (temp.charAt(1) - '0');
            }

            if((temp.length() != 2) || x < 0 || x >= SIZE || y < 0 || y >= SIZE){
                System.out.println("error! please enter again");
                continue;
            }

            if(ship_point[x-1][y-1] == 1){
                index++;
                cur_ship_point[x][y] = 'O';
                if(index % 2 != 0){
                    person1_point++;
                }
                else{
                    person2_point++;
                }
            }
            else{
                index++;
                cur_ship_point[x][y] = 'X';
            }

            for(int i = 0; i < SIZE; i++){
                System.out.println(cur_ship_point[i]);
            }
            System.out.printf("person1 point = %d\n", person1_point);
            System.out.printf("person2 point = %d\n", person2_point);
        }
    }
}