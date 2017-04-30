/**
 * Created by Mariano on 29/04/2017.
 */
public class Student implements Comparable<Student> {
    private String name;


    public Student(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }





}

