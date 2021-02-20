/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaf;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author youm7
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ArtStudent s1 = new ArtStudent(1, "mo", "Arbic");
        s1.grade_ArtStudent(10, 20, 30);
        ArtStudent s2 = new ArtStudent(2, "Ahmed", "English");
        s2.grade_ArtStudent(50, 10, 40);
        ArtStudent s3 = new ArtStudent(3, "Anis", "math");
        s3.grade_ArtStudent(50, 20, 10);
        ItStudent s4 = new ItStudent(4, "ali", "Sciences");
        s4.grade_ItStudent(10, 30, 15);
        ItStudent s5 = new ItStudent(5, "omar", "French");
        s5.grade_ItStudent(50, 10, 25);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        students = sort(students);

        File f = new File("Student.txt");
        f.createNewFile();
        PrintWriter pr = new PrintWriter(f);
        for (Student s : students) {
            pr.println(s.print());
        }
        pr.close();
    }

    public static List<Student> sort(List<Student> std) {
        ArrayList<Student> students = (ArrayList) std;
        for (int i = 0; i < std.size(); i++) {
            for (int j = i + 1; j < std.size(); j++) {
                if (std.get(i).getGrade() < std.get(j).getGrade()) {
                    Student temp = std.get(i);
                    std.set(i, std.get(j));
                    std.set(j, temp);
                }
            }
        }
        return students;
    }

}
