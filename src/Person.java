public abstract class Person {
    protected int id;
    protected String name;
    protected String surname;


    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public abstract String getRole();

    public String basicInfo() {return id + " | " + name + " | " + surname;}
}