import java.util.Date;
import java.text.SimpleDateFormat;

class ImportTest{
    public static void main(String[] argv){
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("today : " + date.format(today));
        System.out.println("now :" + time.format(today));
    }
}