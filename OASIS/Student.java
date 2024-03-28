
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Default constructor. Initializes a student with default values.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor to initialize a student with provided values.
     *
     * @param name  The name of the student.
     * @param id    The ID of the student.
     * @param email The email of the student.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }


    /**
     * Copy constructor to create a new student from an existing one.
     *
     * @param s The student to copy.
     */
    public Student(Student s) {
        this.name = s.name;
        this.email = s.email;
        this.group = s.group;
        this.id = s.id;
    }

    /**
     * Retrieves a string representation of the student's information.
     *
     * @return A string representing the student's information.
     */
    public String getInfo() {
        return (this.name + " - " + this.id + " - " + this.group + " - " + this.email);
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getGroup() {
        return this.group;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
