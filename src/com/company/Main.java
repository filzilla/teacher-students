package com.company;

import java.util.*;
import java.util.Set;

public class Main {

    public static void main(String[] args) {



        Student sam = new Student("Sam", "Jones", 5432, 1);
        Student sarah = new Student("Sarah", "Jones", 9876, 1);
        Student joe = new Student("Joe", " Smith", 7654, 1);
        Student janice = new Student("Janice", "Joplin", 2314, 1);
        Student alex = new Student("Alex", "Thibidauex", 7321, 1);
        Student alice = new Student("Alice", "Lemonade", 9876, 1);
        Student becky = new Student("Becky", "Anderson", 1236, 1);
        Student bob = new Student("Bob", "Jones", 1234, 1);
        Student carl = new Student("Carl", "Grimes", 2364, 1);
        Student cindy = new Student("Cindy", "Simpson", 4567, 1);
        Student della = new Student("Della", "Payne", 1187, 1);
        Student daniel = new Student("Daniel", "Sullivan", 5432, 1);
        Student edgar = new Student("Edgar", "Burroughs", 3465, 1);
        Student ellen = new Student("Ellen", "Degeneres", 7342, 1);
        Student polly = new Student("Polly", "Butts", 5009, 1);


        Teacher Chris = new Teacher("Chris", "Nimmons", 4332, 1);
        Teacher Spencer = new Teacher("Spencer", "Oakes", 6777, 1);
        Teacher Calvin = new Teacher("Calvin", "Webster", 9090, 1);

        Set<Student> studentListOne = new HashSet<>();
        studentListOne.add(sam);
        studentListOne.add(sarah);
        studentListOne.add(joe);
        studentListOne.add(janice);
        studentListOne.add(alex);

        Set<Student> studentListTwo = new HashSet<>();
        studentListTwo.add(becky);
        studentListTwo.add(bob);
        studentListTwo.add(carl);
        studentListTwo.add(della);
        studentListTwo.add(daniel);


        Set<Student> studentListThree = new HashSet<>();
        studentListThree.add(cindy);
        studentListThree.add(edgar);
        studentListThree.add(ellen);
        studentListThree.add(polly);
        studentListThree.add(alice);

        Map<Teacher, Set> classes = new HashMap<>();
        classes.put(Chris, studentListOne);
        classes.put(Spencer, studentListTwo);
        classes.put(Calvin, studentListThree);

        for( Teacher key: classes.keySet()){

            System.out.println(key);
        }


        for( Set value : classes.values()){
            System.out.println(value);

        }


    }
}