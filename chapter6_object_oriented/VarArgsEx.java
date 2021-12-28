class VarArgsEx{
    public static void main(String[] argv){
        String[] Arr = {"100", "200", "300"};

        System.out.println(concrete("", "100", "200", "300"));
        System.out.println(concrete("-", Arr));
        System.out.println(concrete(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concrete(",") + "]");
    }

    static String concrete(String delim, String... args){
        String result = "";
        for(String temp : args){
            result +=  temp + delim;
        }
        return result;
    }
}