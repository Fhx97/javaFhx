package com.fengxiaoshuai.finaltest;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.Comparator;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("jack",18,89,98,99);
        Student s2 = new Student("Mike",19,89,78,99);
        Student s3 = new Student("Linda",21,89,98,88);
        Student s4 = new Student("Frank",17,92,93,100);
        Student s5 = new Student("Joe",20,89,98,99);

        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getChinese()!=o2.getChinese()){
                    return o1.getChinese() - o2.getChinese();
                }else{
                    if(o1.getMath()!=o2.getMath()){
                        return o1.getMath() - o2.getMath();
                    }else{
                        if(o1.getEnglish()!=o2.getEnglish()){
                            return o1.getEnglish() - o2.getEnglish();
                        }else{
                            if(o1.getAge()!=o2.getAge()){
                                return o1.getAge() - o2.getAge();
                            }else{
                              if(o1.getName().equals(o2.getName())){
                                  return 0;
                              }else{
                                  return o1.getName().compareTo(o2.getName());
                              }
                            }
                        }
                    }
                }
            }
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
