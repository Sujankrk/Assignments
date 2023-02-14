public class IsAHasAUsesAProducesAHomeWork {
    public static void main(String[] args) {
        Oxford oxford=new Oxford("Sujan Karki", 30);
       char grade= oxford.PassingCriteria(90);
        System.out.println("The Student's grade is " +grade);

        oxford.student.teach();
        oxford.student.practicals();
        oxford.student.fieldTrips();
    }
}
class University{

}
class Oxford extends University {

    String studentName;
    int studentRollNo;

    Engineering student = new Engineering();


    public Oxford(String stName, int stRollNo) {
        studentName = stName;
        studentRollNo = stRollNo;
    }

    char PassingCriteria(float marks) {

        float studentMarks = marks;
        char grade;
        System.out.println("The University Conducts examinations every week");
        if (marks >= 89 && marks <= 100) ;
        grade = 'A';
        if (marks >= 74 && marks <= 89) ;
        grade = 'B';
        if (marks >= 65 && marks <= 74) ;
        grade = 'C';
        if (marks >= 55 && marks <= 65) ;
        grade = 'D';
        if (marks >= 35 && marks <= 55) ;
        grade = 'E';
        if (marks <= 35) ;
        grade = 'F';

        System.out.println("The Student's name is " + studentName + " and the roll number is " + studentRollNo);

        return grade;
    }


    class Faculty {

    }

    class Engineering extends Faculty {

        void teach() {
            System.out.println("This faculty teaches engineering ");
        }

        void practicals() {
            System.out.println("This faculty conducts practicals");
        }

        void fieldTrips() {
            System.out.println("This faculty takes you to the field trips to see great engineering buildings");
        }
    }
}


