/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_photon_q1_extra.credit;

/**
 *
 * @author Lance Masipag
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher t1 = new Teacher("Teacher1", "Math");
        Teacher t2 = new Teacher("Teacher2", "Science");
        Teacher t3 = new Teacher("Teacher3", "History");

        Section c1 = new Section("Section1");
        Section c2 = new Section("Section2");

        Student s1 = new Student("Student1");
        Student s2 = new Student("Student2");
        Student s3 = new Student("Student3");

        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s3);

        t1.addSection(c1);
        t1.addSection(c2);
        t2.addSection(c2);
        t3.addSection(c1);

        Assignment a1 = new Assignment("Assignment1", 2);
        Assignment a2 = new Assignment("Assignment2", 3);
        Assignment a3 = new Assignment("Assignment3", 5);

        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);

        s2.finishAssignment(a1);

        System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
}