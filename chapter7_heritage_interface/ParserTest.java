class ParserTest{
    public static void main(String[] argv){
        Parseable parser = ParserManager.getparse("XML");
        parser.parse("document.XML");
        Parseable parser2 = ParserManager.getparse("HTML");
        parser2.parse("document.HTML");
    }
}

interface Parseable{
    public abstract void parse(String fileName);
}

class ParserManager{
    public static Parseable getparse(String fileName){
        if(fileName.equals("XML")){
            return new XML();
        }
        else{
            return new HTML();
        }
    }
}

class XML implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "- XML Parsing completed.");
    }
}

class HTML implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "- HTML Parsing completed.");
    }
}