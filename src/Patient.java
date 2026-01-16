public class Patient {
    private int id;
    private String name;
    private int age;
    private int doctorId;

    public Patient(int id, String name, int age, int doctorId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.doctorId = doctorId;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
