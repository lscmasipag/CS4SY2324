/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_q1_extra.credit;

/**
 *
 * @author Lance Masipag
 */
public class Assignment {
    private final String name;
    private final double timeAllotted;

    public Assignment(String name, double timeAllotted) {
        this.name = name;
        this.timeAllotted = timeAllotted;
    }

    public double getTimeAllotted() {
        return timeAllotted;
    }

    public String getName() {
        return name;
    }
}