package com.company;

public class Student {

    private final int id;
    private static int nextId=1;
    private String name;
    private String surname;
    private String age;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;
    public Student(String name, String surname, String age, String phoneNumber, String faculty, String course, String group) {

        this.name=name;
        this.surname=surname;
        this.age = age;
        this.phoneNumber=phoneNumber;
        this.faculty=faculty;
        this.course=course;
        this.group=group;

        id=nextId++;

        setName(name);
        setSurname(surname);
        setAge(age);
        setPhoneNumber(phoneNumber);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String toString() {
        return "Student's info: "+" id " +id+
                "; name is " + name +
                "; surname is " + surname +
                "; age is " + age +
                "; phone number is " + phoneNumber +
                "; BSUIR, " + faculty +
                "; the course is" + course +
                "; number of the group is " + group;
    }
}
