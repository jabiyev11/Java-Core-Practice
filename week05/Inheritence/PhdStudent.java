package week05.Inheritence;

import java.util.Arrays;

class PhdStudent extends Student{

    private String department;
    private String[] courses;


    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses){
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setCourses(String[] courses){
        this.courses = courses;
    }

    public String[] getCourses(){
        return courses;
    }

    @Override

    public String toString(){
        return "PhdStudent{" + 
        "firstname= '" + getFirstName() + '\''
        + ", lastname= '" + getLastName() + '\''
        + ", gender= '" + getGender() + '\''
        + ", studentId= '" + getStudentId() + '\'' 
        + ", department= '" + department+ '\'' 
        + ", courses= '" + Arrays.toString(courses) + '\'' 
        + '}';
    }

    public boolean equals(PhdStudent pStud){
        if(this == pStud) return true;
        if(this == null || getClass() != pStud.getClass()) return false;
        if(!super.equals(pStud)) return false;

        PhdStudent phdStudent = (PhdStudent) pStud;

        return department.equals(phdStudent.department) && Arrays.equals(courses, phdStudent.courses);
    }

}
