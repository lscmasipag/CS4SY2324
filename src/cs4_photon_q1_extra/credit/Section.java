/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_q1_extra.credit;

import java.util.ArrayList;

/**
 *
 * @author Lance Masipag
 */
public class Section {
    private String name;
    private ArrayList<Student> students;

    public Section(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void assignAssignmentToStudents(Assignment a) {
        for (Student student : students) {
            student.addAssignment(a);
        }
    }

    public String getName() {
        return name;
    }
}
