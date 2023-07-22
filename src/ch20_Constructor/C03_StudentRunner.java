package ch20_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student std = new C03_Student();

        std.name = "ezgi";
        std.lastName = "topraker";
        std.classNo = 1;
        std.degree = 90.5;
        std.success = true;
        std.schoolNo = 458;

        System.out.println("std = " + std);
        //std = C03_Student{name='ezgi', lastName='topraker', classNo=1, degree=90.5, schoolNo=458, success=true}

        std.graduate(); //you are graduated
        std.socialActivity(); //you should join activities
    }
}
