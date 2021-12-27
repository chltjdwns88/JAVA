class OperatorEx3_3{
    public static void main(String[] argv){
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket == 0 ? 0 : 1);
        System.out.println(numOfBucket);
    }
}