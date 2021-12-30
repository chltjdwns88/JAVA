import java.util.*;

class ArrayListEx2{
    public static void main(String[] argv){
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ";
        int len = source.length();
        List list = new ArrayList(LIMIT/len+10);

        for(int i = 0; i < len; i+=LIMIT){
            if(i+LIMIT < len){
                list.add(source.substring(i, i+LIMIT));
            }else{
                list.add(source.substring(i));
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}