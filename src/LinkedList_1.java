import java.util.LinkedList;


public class LinkedList_1 {
    public static void main(String[] args) {

        Student5 st1 = new Student5("Ivan", 3);
        Student5 st2 = new Student5("Jon", 4);

        LinkedList<Student5> studentLinkedList5 = new LinkedList<>();
        studentLinkedList5.add(st1);
        studentLinkedList5.add(st2);




        System.out.println("LinkedList = " + studentLinkedList5);

    }
    }


class Student5 {
        String name;
        int course;

        public Student5(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student(" + "name= " + name + " course=" + course + ")";
        }

    }


