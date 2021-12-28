class OverloadingTest{
    public static void main(String[] argv){
        overload ol = new overload();
        int[] int_arr = {1 ,2, 3, 4, 5};
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(1, 2L));
        System.out.println(ol.add(1L, 2));
        System.out.println(ol.add(1L, 2L));
        System.out.println(ol.add(int_arr));
    }
}

class overload{
    int add(int a, int b){return a+b;}
    long add(int a, long b){return a+b;}
    long add(long a, int b){return a+b;}
    long add(long a, long b){return a+b;}

    int add(int[] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}