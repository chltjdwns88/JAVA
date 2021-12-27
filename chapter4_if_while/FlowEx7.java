import java.util.*;

class FlowEx7{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter (1)rock (2)siser (3)paper ! > ");
        String temp = scanner.nextLine();
        int rsp = Integer.parseInt(temp);

        int com = (int)(Math.random() * 3) + 1;

        System.out.println("you : " + rsp);
        System.out.println("com : " + com);

        switch(rsp - com){
            case 0:
                System.out.print("draw!");
                break;
            case -1: case 2:
                System.out.print("win!");
                break;
            default:
                System.out.print("lose!");
        }
    }
}