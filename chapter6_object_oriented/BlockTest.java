class BlockTest{
    public static void main(String[] argv){
        System.out.println("BlockTest block_t1 = new BlockTest();");
        BlockTest block_t1 = new BlockTest();

        System.out.println("BlockTest block_t2 = new BlockTest();");
        BlockTest block_t2 = new BlockTest();
    }

    static{
        System.out.println("class initial{}");
    }

    {
        System.out.println("instance initial{}");
    }

    BlockTest(){
        System.out.println("BlockTest Constructor!!");
    }
}

