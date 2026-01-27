public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, String surname, String specialization) {
        super(id, name, surname);
        this.specialization = specialization;
    }

    @Override
    public String getRole() {return "Doctor";}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor d = (Doctor) o;
        return id == d.id;
    }

    @Override
    public int hashCode() {return id;}

    @Override
    public String toString() {return basicInfo() + " | " + specialization;}
}