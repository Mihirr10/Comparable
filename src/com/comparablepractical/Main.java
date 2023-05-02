package com.comparablepractical;

import com.comparablepractical.student.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> arrayList = new ArrayList<>();
    arrayList.add(new Student(18, "Mihir", 23));
    arrayList.add(new Student(15, "Yashraj", 20));
    arrayList.add(new Student(20, "Yuvraj", 19));

    Collections.sort(arrayList);
    for (Student st : arrayList) {
      System.out.println(st);
    }
  }
}