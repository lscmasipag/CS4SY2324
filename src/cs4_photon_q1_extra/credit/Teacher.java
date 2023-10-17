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
public class Teacher {
    private final String name;
    private final String subject;
    private final ArrayList<Section> sections;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.sections = new ArrayList<>();
    }

    public void giveAssignment(Assignment a) {
        for (Section section : sections) {
            section.assignAssignmentToStudents(a);
        }
    }

    public void addSection(Section s) {
        sections.add(s);
    }

    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
}