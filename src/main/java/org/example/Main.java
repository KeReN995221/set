package org.example;

import entities.Course;
import entities.Instructor;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Integer> setA = Arrays.asList(21,35,22);
        List<Integer> setB = Arrays.asList(21,50);
        List<Integer> setC = Arrays.asList(42, 35, 13);

        Course<Integer> cA = new Course<>('A', new Instructor("Alex"), setA);
        Course<Integer> cB = new Course<>('B', new Instructor("Alex"), setB);
        Course<Integer> cC = new Course<>('C', new Instructor("Alex"), setC);

        System.out.print("How many students for course A? " + setA.size());
        System.out.println();
        for (int i=0; i<setA.size(); i++){ System.out.println(setA.get(i));}

        System.out.print("How many students for course B? " + setB.size());
        System.out.println();
        for (int i=0; i<setB.size(); i++){ System.out.println(setB.get(i));}

        System.out.print("How many students for course C? " + setC.size());
        System.out.println();
        for (int i=0; i<setC.size(); i++){ System.out.println(setC.get(i));}


        Set<Integer> c = new TreeSet<>(setA);
        c.addAll(setB);
        c.addAll(setC);
        int count = 0;
        for (int i=0; i < c.size(); i++){ count+= 1;}
        System.out.println("Total students: " + count);



        keyboard.close();
    }
}