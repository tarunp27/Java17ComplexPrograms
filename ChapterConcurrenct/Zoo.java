package ChapterConcurrenct;

public class Zoo {
    public void print(){
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {}
        System.out.println("print() Thread finished");
    }
    public static void printmsg(String name){
        System.out.println("Hello Mr."+name);
        System.out.println("printmsg() thread finished");
    }

    public static void main(String[] args) throws InterruptedException {
        Zoo z = new Zoo();
        var job = new Thread(()->z.print());
        var job2 = new Thread(()->printmsg("Pugalendi"));
        job.start();
        job2.start();
        Thread.sleep(1000);
        System.out.println(job.getState());
        System.out.println(job2.getState());
        System.out.println("Main method finished");
    }
}

