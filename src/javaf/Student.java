/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author youm7
 */
public abstract class Student {

    private int id;
    private String name;
    private String major;
    private double grade;

    public Student(int id, String neme, String major) {
        this.id = id;
        this.name = neme;
        this.major = major;

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the neme
     */
    public String getNeme() {
        return name;
    }

    /**
     * @param neme the neme to set
     */
    public void setNeme(String neme) {
        this.name = neme;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

 
public String print() {
        return  "id=" + id + ", name=" +name + ", major=" + major + ", grade=" + grade ;
    }
}
