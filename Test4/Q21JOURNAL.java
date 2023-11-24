package Test4;

public record Q21JOURNAL(int id, String name) {
    public Q21JOURNAL(){
        this(1,"Pugal");
    }
    public Q21JOURNAL(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
