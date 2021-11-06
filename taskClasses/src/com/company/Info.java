package com.company;

public class Info {
        public static void main(String[] args) {
            Student st1 = new Student("Lisa", "Diagel", "20", "+375258746374", " Faculty of Engineering and Economics ", "3", " 974001 ");
            Student st2 = new Student("Misha", "Atapovich", "18", "+375339842657", " Faculty of Computer Systems and Networks ", "2", " 051005 ");
            Student st3 = new Student("Nadia", "Trofimchik", "21", "+375333303317", " Faculty of Automated Information Processing Systems ", "4", " 820605 ");
            Student st4 = new Student("Dasha", "Andrievskaya", "19", "+375336572990", " Faculty of Engineering and Economics ", "3", " 974002 ");
            Student st5 = new Student("Igor", "Baibak", "18", "+375298374111", " Faculty of Computer Systems and Networks ", "2", " 051005 ");
            Student st6 = new Student("Gleb", "Kozlovsky", "20", "+375298044441", " Faculty of Automated Information Processing Systems ", "4", " 820603 ");
            Student st7 = new Student("Rita", "Sedlyar", "19", "+375449045005", " Faculty of Engineering and Economics ", "3", " 974001 ");
            Student st8 = new Student("Sasha", "Petrov", "18", "+375299740001", " Faculty of Computer Systems and Networks ", "2", " 051001 ");
            Student st9 = new Student("Ksysha", "Romanchuk" , "19", "+375445603312", " Faculty of Engineering and Economics ", "3", " 974004 ");

            listOfStudents newList=new listOfStudents();
            newList.addStudent(st1);
            newList.addStudent(st2);
            newList.addStudent(st3);
            newList.addStudent(st4);
            newList.addStudent(st5);
            newList.addStudent(st6);
            newList.addStudent(st7);
            newList.addStudent(st8);
            newList.addStudent(st9);

            newList.facultyPrint(" Faculty of Engineering and Economics ");
            newList.groupPrint(" 974001 ");
            newList.agePrint("19");

        }
    }
