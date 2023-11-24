package Test6;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {


        List<String> values = Arrays.asList("Alpha A", "Alpha A", "Alpha A");
        boolean flag = values.stream().allMatch(str -> str.equals("Alpha A"));
        boolean flag3 = values.stream().anyMatch(str -> str.equals("Alpha A"));
        boolean flag1 = values.stream().findAny().get().equals("Alpha A");
        boolean flag2 = values.stream().findFirst().get().equals("Alpha A");
        System.out.println(flag);
        return ;
    }

    String   someMethod(){
        int x = 5;
        return "";
    }
}


class TestClass extends Thread
{
    private static int threadcounter = 0;
    public void run()
    {
        threadcounter++;
        System.out.println(threadcounter);
    }
    public static void main(String[] args)
    {
        for(int i=0; i<10; i++)
        {
            synchronized(TestClass.class)
            {
                new TestClass().start();
            }
        }
    }
}


class Test{
    public static void main(String[] args){
        for (var i = 0; i < 10; i++) System.out.print(i + " ");  //1
        for (var i = 10; i > 0; i--) System.out.print(i + " ");  //2
        var i = 20;                  //3
        System.out.print(i + " ");   //4
    }
}
