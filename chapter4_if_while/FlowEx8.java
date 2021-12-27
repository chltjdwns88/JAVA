import java.util.*;

class FlowEx8{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        System.out.print("pleae enter pid ex(000000-0000000)>");
        String temp = scanner.nextLine();
        char opt = temp.charAt(7);

        switch(opt){
            case '1': case '3':
                System.out.print("men!");
                break;
            case '2': case '4':
                System.out.print("women!");
                break;
            default:
                System.out.print("error!!");
                break;
        }
    }
}