/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaf;

/**
 *
 * @author youm7
 */
public class ArtStudent extends Student {

    public ArtStudent(int id, String neme, String major) {
        super(id, neme, major);
    }

    public double grade_ArtStudent(int mide, int proj, int finalp) {
      double  grade= mide * 0.40 + proj * 0.10 + finalp * 50;
        setGrade(grade);
        return grade;
    }

}
