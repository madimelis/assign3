public class Patient extends Person{
    private int age;
    private int doctorId;

    public Patient(int id, String name, String surname, int age, int doctorId) {
        super(id, name, surname);
        this.age = age;
        this.doctorId = doctorId;
    }

    public int getAge() {return age;}

    public int getDoctorId() {return doctorId;}

    @Override
    public String getRole() {return "Patient";}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id == p.id;
    }

    @Override
    public int hashCode() {return id;}

    @Override
    public String toString() {return basicInfo() + " (" + age + ") | doctorId: " + doctorId ;}
}