package b10701108_hw;

import java.util.Arrays;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shou
 */
// 做名字比較
class CompareName implements Comparator< Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int diff = o1.name.compareTo(o2.name);
        if (diff != 0) {
            return diff;

        }
        return o1.name.compareTo(o2.name);
    }
}
// 做ID比較
class CompareID implements Comparator< Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }
}
// 做成績比較
class CompareGrade implements Comparator< Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.grade - o1.grade;
    }
}

public class Student {

    String name;
    int id;
    int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public String toString() {
        return String.format("Name: %s ID: %d Grade: %d", name, id, grade);
    }

//    開始run
    public static void main(String[] args) {

        Student students[] = {
            new Student("Caleb", 104992, 99),
            new Student("Derek", 102113, 88),
            new Student("Dylan", 101111, 12),
            new Student("Anthony", 109123, 13),
            new Student("Bruce", 102334, 12),
            new Student("Spike", 110222, 1),};
//            display(students);
        Namesort(students);
        IDsort(students);
        Gradesort(students);

    }
// 比較後做排序
    public static void Namesort(Student stu[]) {
        System.out.println("原排序:");
        display(stu);
        System.out.println("---- after sorting name --------");
        System.out.println("照名字排序:");
        CompareName comp = new CompareName();
        Arrays.sort(stu, comp);
        display(stu);

    }

    public static void IDsort(Student stu[]) {

//       System.out.println("原排序:");
//        display(stu);
        System.out.println("---- after sorting ID --------");
        System.out.println("照學號排序:");
        CompareID comp = new CompareID();
        Arrays.sort(stu, comp);
        display(stu);

    }

    public static void Gradesort(Student stu[]) {
//        System.out.println("原排序:");
//        display(stu);
        System.out.println("---- after sorting grade --------");
        System.out.println("照成績排序:");
        CompareGrade comp = new CompareGrade();
        Arrays.sort(stu, comp);
        display(stu);

    }

    private static <T> void display(T x[]) {

        for (int i = 0; i < x.length; i++) {
            if (i > 0) {
                System.out.println(",");
            }
            System.out.print(x[i]);
        }
        System.out.println();

    }

}
