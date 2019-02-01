class ArrayAssignment
{
    static int[] numArray = {20, 3, 6, 10, 13, 25, 100, 6, 3, 20, 5102};
    static long[] fibonacci = new long[100];

    public static void main(String[] args) 
    {
        System.out.println( numArray[3] ); //6

        //System.out.println( numArray[11] ); //5102

        System.out.println( numArray[1] ); //20

        System.out.println( numArray[7] ); //100

        System.out.println( numArray[8] ); //6  damn, I forgot to start at 0

        System.out.println( numArray[4] );
        System.out.println( numArray[1] );
        System.out.println( numArray[10] );
        System.out.println( numArray[5] );
        System.out.println( numArray[0] );


        System.out.println("fibonacci:");
        fibonacci[0]=1;
        fibonacci[1]=1;
        for(int i=2; i<100; i++)
        {
            fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
            System.out.println(fibonacci[i]);
        }


        
    }
}