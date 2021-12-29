import java.util.*;

class StringTokenizerEx1{
    public static void main(String[] argv) throws Exception{
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        // System.out.println(st.nextToken());
        // System.out.println(st.nextToken());
        // System.out.println(st.nextToken());
        // System.out.println(st.nextToken());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}