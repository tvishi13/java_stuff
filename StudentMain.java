class Student {
    String name;
    int[] marks;
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
public class StudentMain {
    public static void main(String[] args) {
             Student[] students = new Student[3];
        students[0] = new Student("Adrita", new int[]{85, 90, 88});
        students[1] = new Student("Sarim", new int[]{75, 80, 70});
        students[2] = new Student("Tvishi", new int[]{90, 92, 95});
        Student topStudent = students[0]; // Assume first is highest at start
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > topStudent.getAverage()) {
                topStudent = students[i];
            }
        }
        System.out.println("Student with highest average marks:");
        System.out.println("Name: " + topStudent.name);
        System.out.println("Average Marks: " + topStudent.getAverage());
    }
}
