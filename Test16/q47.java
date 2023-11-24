package Test16;

import java.util.Arrays;
import java.util.List;

public class q47 {
}


class OuterWorld
{
    InnerPeace i = new InnerPeace("none"); //1

     class InnerPeace
    {
        private String reason = "none";
        InnerPeace(String reason){ this.reason = reason; }
    }
    public void main(String[] args){



         List<String> values = Arrays.asList("Alpha A", "Alpha B", "Alpha C");

        boolean flag = values.stream().allMatch(str->str.equals("Alpha A"));
        System.out.println(flag);


        var ip = new InnerPeace("yoga"); //2
        var out = new OuterWorld();
        System.out.println(out.i.reason); //3
    }
}


