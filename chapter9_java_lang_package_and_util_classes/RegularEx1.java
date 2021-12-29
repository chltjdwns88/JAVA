import java.util.regex.*;

class RegularEx1{
    public static void main(String[] argv){
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c."};

        Pattern p = Pattern.compile("c[a-z]*");

        for(int i = 0; i < data.length; i++){
            Matcher m = p.matcher(data[i]);
            if(m.matches()){
                System.out.print(data[i] + ",");
            }
        }
    }
}