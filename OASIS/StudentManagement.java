
public class StudentManagement {
    private Student[] students = new Student[100];
    private int numOfStudent = 0;

    /**
     * Checks if two students belong to the same group.
     *
     * @param s1 The first student.
     * @param s2 The second student.
     * @return True if they belong to the same group, false otherwise.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Adds a new student to the management system.
     *
     * @param newStudent The student to be added.
     */
    public void addStudent(Student newStudent) {
        students[numOfStudent] = newStudent;
        numOfStudent++;
    }

    /**
     * Generates a string representation of students grouped by their groups.
     *
     * @return A string representing students grouped by their groups.
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();

        String[] groups = new String[100];
        int numOfGroups = 0;

        for (int i = 0; i < numOfStudent; i++) {
            boolean isExisted = false;
            for (int j = 0; j < numOfGroups; j++) {
                if (groups[j] != null && groups[j].equals(students[i].getGroup())) {
                    isExisted = true;
                    break;
                }
            }
            if (!isExisted) {
                groups[numOfGroups++] = students[i].getGroup();
            }
        }

        for (int i = 0; i < numOfGroups; i++) {
            result.append(groups[i]).append("\n");
            for (int j = 0; j < numOfStudent; j++) {
                if (students[j].getGroup().equals(groups[i])) {
                    result.append(students[j].getInfo()).append("\n");
                }
            }
        }
        return result.toString();
    }

    /**
     * Removes a student from the management system based on their ID.
     *
     * @param id The ID of the student to be removed.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < numOfStudent; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < numOfStudent - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numOfStudent - 1] = null; // Set the last element to null
                numOfStudent--;
                break; // Exit loop after removing the student
            }
        }
    }

    /**
     * Main method to test the functionality of StudentManagement class.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Student n1 = new Student("Nguyen Van A", "17020001", "17020001@vnu.edu.vn");
        n1.setGroup("K62CC");
        Student n2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        n2.setGroup("K62CC");
        Student n3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student n4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        StudentManagement sm = new StudentManagement();
        sm.addStudent(n1);
        sm.addStudent(n2);
        sm.addStudent(n3);
        sm.addStudent(n4);
        System.out.println(sm.studentsByGroup());
    }
}

