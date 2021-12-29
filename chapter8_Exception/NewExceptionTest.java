class NewExceptionTest{
    public static void main(String[] argv){
        try{
            startInstall();
        }catch(spaceException se){
            System.out.println("error message : " + se);
            System.out.println("try again! after make enough space");
        }catch(memoryException me){
            System.out.println("error message : " + me.getMessage());
            System.out.println("try again! after make enough memory");
        }
    }
    
    static void startInstall()throws memoryException, spaceException{
        if(!enoughmemory()){
            throw new memoryException("not enough memory!");
        }
        if(!enoughspace()){
            throw new spaceException("not enough space!");
        }
    }

    static boolean enoughmemory(){
        return false;
    }
    static boolean enoughspace(){
        return true;
    }
}

class spaceException extends Exception{
    spaceException(String message){
        super(message);
    }
}

class memoryException extends Exception{
    memoryException(String message){
        super(message);
    }
}
