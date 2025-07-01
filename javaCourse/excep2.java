class excep2 {
    public static void main(String[] args){
        int a= 10;
        System.out.println("this is a "+ a);
        int b = 0;
        System.out.println("this is b " +b );
        try{
        int c = a/b;
        System.out.println("this is c " + c);
        }catch(ArithmeticException e){
        }
        finally{
            System.out.println("this block is always execute");
        }

    }
    
}
