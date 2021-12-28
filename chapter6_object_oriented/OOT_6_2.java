class OOT_6_2{
    public static void main(String[] argv){
        StudentCard card1 = new StudentCard(3, false);
        StudentCard card2 = new StudentCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class StudentCard{
    int num;
    boolean flag;

    StudentCard(){
        num = 1; flag = true;
    }
    StudentCard(int num, boolean flag){
        this.num = num; this.flag = flag;
    }
    public String info(){
        return num + (flag == true ? "true" : "false");
    }
}