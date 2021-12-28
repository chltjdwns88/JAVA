class DocumentTest{
    public static void main(String[] argv){
        Document d1 = new Document();
        Document d2 = new Document();
        Document d3 = new Document("java.txt");
        Document d4 = new Document();

        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d3.name);
        System.out.println(d4.name);
    }
}

class Document{
    String name;
    static int num = 0;

    Document(){
        this("no title" + ++num);
    }
    Document(String name){
        this.name = name;
    }
}