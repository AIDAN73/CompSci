class IteratingAssignment
{
    static String[] greetings = {sup, hello, what are you doing, aaaaaaaaaaaaaa, why me, who are you, I am just writing crap};

    public static void main(String[] args) 
    {
        
        for(int value : greetings)
        {
            if (value % 2==1)
            System.out.println(value);

        }

    }
}