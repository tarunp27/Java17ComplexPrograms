package ChapterConcurrenct;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class Speaking {
    void talk() {
        System.out.println("Inside");
        try {
                Thread.sleep(1_000);
        } catch (InterruptedException e) {
            System.out.println("How rude!");
        }
    }
    public static void main(String[] args) {
        var s = new Speaking();
        var t = new Thread(() -> s.talk());
        t.run();
        t.interrupt();
        t.interrupt();
        t.interrupt();
    } }


class Names{
    private List<String> list;
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void printNames(){
        System.out.println(getList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Bob Hope",
                "Bob Dole",
                "Bob Brown"
        );

        Names n = new Names();
        n.setList(list.stream().collect(Collectors.toList()));
        n.printNames();
    }

}

