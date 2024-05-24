package week05.Inheritence;

import java.util.Arrays;


class Teacher extends Person{

    
    private String department;
    private String[] courses;


    public Teacher(String firstName, String lastName, String gender, String department, String[] courses){
        super(firstName, lastName, gender);
        this.courses = courses;
        this.department = department;
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
        return "Teacher{" + 
        "firstname= '" + getFirstName() + '\''
        + ", lastname= '" + getLastName() + '\''
        + ", gender= '" + getGender() + '\''
        + ", department= '" + department + '\''
        + ", courses= '" + Arrays.toString(courses)  + '\'' 
        + '}';

    }

    public boolean equals(Teacher t){
        if(this == t) return true;
        if(t == null || getClass() != t.getClass()) return false;
        if(!super.equals(t)) return false;

        Teacher teacher = (Teacher) t;
        return department.equals(teacher.department) && Arrays.equals(courses, teacher.courses);
    }
}