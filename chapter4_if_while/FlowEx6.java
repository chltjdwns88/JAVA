import java.util.*;

class FlowEx6{
    public static void main(String[] argv){
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter now month>");
        String temp = scanner.nextLine();
        month = Integer.parseInt(temp);

        switch(month){
            case 3: case 4: case 5:
                System.out.println("Spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer!");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall!");
                break;
            default:
                System.out.println("Winter!");
                break;
        }
    }
}