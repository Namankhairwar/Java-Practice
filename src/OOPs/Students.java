package OOPs;

class Students {
    int studentId;
    String studentName;
    String studentCity;

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }

    public Students() {
        System.out.println("Students Constructor");
    }
    public Students(int studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public void study() {
        System.out.println(studentName + " is studying");
    }
    public double study(double grade) {
        System.out.println(studentName + " is studying");
        return 0;
    }

    public void  display() {
        System.out.println( "Student's name is : " + studentName);
        System.out.println("Student city is : " + studentCity);
        System.out.println("Student id is : " + studentId );

    }

    public static void main(String[] args) {
        Students s = new Students();
        s.studentName = "John";
        s.study();
    }
}
