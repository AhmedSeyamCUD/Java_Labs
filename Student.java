public class Student extends Person {
    private int studentNumber;

    public Student() {
        super();
        studentNumber = 0;
    }

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public void reset(String name, int studentNumber) {
        setName(name);
        this.studentNumber = studentNumber;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(Student otherStudent) {
        return super.hasSameName(otherStudent) && studentNumber == otherStudent.studentNumber;
    }
}
