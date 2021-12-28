class ArrayEx17{
    public static void main(String[] argv){
            if(argv.length != 3){
                System.out.println("please enter 2numbers and 1operation");
            }
            int temp1 = Integer.parseInt(argv[0]);
            int temp2 = Integer.parseInt(argv[2]);
            char op = argv[1].charAt(0);
            switch(op){
                case '+':
                    System.out.println(temp1 + " " + op + " " + temp2 + " = " + temp1 + temp2);
                    break;
            }
        }
}