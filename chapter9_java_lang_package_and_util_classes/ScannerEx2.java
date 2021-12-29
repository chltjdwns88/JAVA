import java.util.Scanner;
import java.io.File;

class ScannerEx2{
    public static void main(String[] argv) throws Exception{
        Scanner sc = new Scanner(new File("data.txt"));
        int sum = 0;
        int cnt = 0;

        while(sc.hasNextInt()){
            sum += sc.nextInt();
            cnt++;
        }
        System.out.println(sum);
    }
}