package com.comparablepractical.student;

public class Student implements Comparable<Student> {
  public int rollno;
  public String name;
  public int age;

  public Student(int rollno, String name, int age) {
    this.rollno = rollno;
    this.name = name;
    this.age = age;
  }


  @Override
  public int compareTo(Student o) {

    if (rollno == o.rollno) {
      return 0;
    } else if (rollno > o.rollno) {
      return 1;
    }
    return -1;

  }

  @Override
  public String toString() {
    return "Student{" + "rollno=" + rollno + ", name='" + name + '\'' + ", age=" + age + '}';
  }
}
