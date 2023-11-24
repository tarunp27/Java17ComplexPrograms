package LetusGetCertifiec;

public class q563_Conc {
}


class ThClass extends Thread
{
    private static int threadcounter = 0;
    public synchronized void run()
    {
        threadcounter++;
        System.out.println(threadcounter);
    }
    public static void main(String[] args) throws Exception
    {
        for(int i=0; i<10; i++)
        {
            synchronized(ThClass.class)
            {
                new ThClass().start();
            }
        }
    }
}
