/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaf;


public class ItStudent extends Student {

    public ItStudent(int id, String neme, String major) {
        super(id, neme, major);
    }

    public double grade_ItStudent(int mide, int proj, int finalp) {
        double grade = mide * 0.30 + proj * 0.30 + finalp * 40;
        setGrade(grade);
        return grade;

    }

}
