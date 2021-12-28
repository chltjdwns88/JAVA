class ArrayEx12{
    public static void main(String[] argv){
        String[] names = {"Kim", "Choi", "Park"};
        for(int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }
        String temp = names[2];
        System.out.println("temp = " + temp);
        names[0] = "Yu";
        for(int i = 0; i < names.length; i++){
            System.out.println("names[" + i + "] = " + names[i]);
        }
    }
}