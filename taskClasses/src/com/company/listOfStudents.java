package com.company;

import java.util.ArrayList;
import java.util.List;


public class listOfStudents {

        private final List<Student> listOfStudents = new ArrayList<>();
        public void addStudent(Student a){
            listOfStudents.add(a);
        }
        public void facultyPrint(String faculty){
            System.out.println("Students of" + faculty);
            for(Student st: listOfStudents){
                if(st.getFaculty().equals(faculty)){
                    System.out.println(st.toString());
                }
            }
        }
        public void groupPrint(String group){
            System.out.println("Students of" + group + "group");
            for(Student st: listOfStudents){
                if(st.getGroup().equals(group)){
                    System.out.println(st.toString());
                }
            }
        }
        public void agePrint(String age){
            System.out.println("Students that are over" + age + "years old");
            for(Student st: listOfStudents){
                if(parseAge(st.getAge().substring(0))>parseAge(age)){
                    System.out.println(st.toString());}
            }
        }


        public int parseAge(String ages){
            return Integer.parseInt(ages);
        }

    }

