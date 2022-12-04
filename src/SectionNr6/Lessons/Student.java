package SectionNr6.Lessons;
// POJO - Plain Old Java Object

// Student POJO class to represent entity Student
public class Student {

    private String id;
    private String name;
    private String dateOfBitrh;
    private String classList;

    // arg-constructor to initialize fields
    public Student(String id, String name, String dateOfBitrh, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBitrh = dateOfBitrh;
        this.classList = classList;
    }

    // annotation Override is the most common annotation in Java
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBitrh='" + dateOfBitrh + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBitrh() {
        return dateOfBitrh;
    }

    public void setDateOfBitrh(String dateOfBitrh) {
        this.dateOfBitrh = dateOfBitrh;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
