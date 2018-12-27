package univer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {
    public   List<Student> students = new ArrayList<Student>();
    public Group() {
        students.add(new Student("Petro",8.4));
        students.add(new Student("Ivan",9.5));
        students.add(new Student("Vasya",7.4));
        students.add(new Student("Mykola",11.2));
        students.add(new Student("Taras",6.5));
        students.add(new Student("Victor",11.5));
        students.add(new Student("Ira",8.3));
        students.add(new Student("Olya",10.1));
        students.add(new Student("Natalya",9.2));
        sort();
    }
    public void sort(){
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student p1, Student p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        int i = 1;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Список всіх студентів");
        for (Student student : students) {
            System.out.println(i + ") " + student.getName());
            ++i;
        }
    }

    protected Student getStudent(int i) {
        return students.get(i);
    }
    public Student getScore(int i){
        return students.get(i);
    }
    protected Student getNam(int i){
        return students.get(i);
    }
}
