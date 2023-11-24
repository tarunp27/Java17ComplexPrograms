package Test10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Q26_Overding_Generi {
    public List<? super CharSequence> getList(int id) {
        return null;
    }
}
class Derived extends Q26_Overding_Generi{
    //public ArrayList<StringBuilder> getList(int id){           //invalid
    //public ArrayList<Object> getList(int id){return null;}     //valid
    //public List<CharSequence>getList(int id){return null;}       //valid
    public LinkedList<? super Object> getList(int id){return null;}
}
