class ChaineExceptionEx{
    public static void main(String[] argv){
        try{
            install();
        }catch(InstallException ie){
            System.out.println("error catch! in main catch(InstallException) : " + ie.getMessage());
        }catch(Exception e){
            System.out.println("error catch! in main catch(Exception)" + e.getMessage());
        }
    }

    static void install() throws InstallException{
        try{
            startInstall();
        }catch(SpaceException se){
            InstallException ie = new InstallException("error! while installing");
            ie.initCause(se);
            throw ie;
        }catch(MemoryException me){
            InstallException ie = new InstallException("error! while installing");
            ie.initCause(me);
            throw ie;
        }finally{
            System.out.println("finally");
        }
    }

    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()){
            throw new SpaceException("not enough space!");
        }
        if(!enoughMemory()){
            throw new MemoryException("not enough memory!");
        }
    }

    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }
}

class InstallException extends Exception{
    InstallException(String msg){
        super(msg);
    }
}

class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}

class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}