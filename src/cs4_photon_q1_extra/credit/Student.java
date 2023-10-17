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
public class Student {
    private final String name;
    private final ArrayList<Assignment> assignments;

    public Student(String name) {
        this.name = name;
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment a) {
        assignments.add(a);
    }

    public void finishAssignment(Assignment a) {
        assignments.remove(a);
    }

    public double getTimeNeeded() {
        double totalTimeNeeded = 0;
        for (Assignment assignment : assignments) {
            totalTimeNeeded += assignment.getTimeAllotted();
        }
        return totalTimeNeeded;
    }

    public String getName() {
        return name;
    }
}
