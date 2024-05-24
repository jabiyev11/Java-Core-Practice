package week05.Inheritence;



class Student extends Person{
    private int studentId;

    public Student(String firstName, String lastName, String gender, int studentId){
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId(){
        return studentId;
    }

    @Override
    public String toString(){
        return "Student{" + 
        "firstname= '" + getFirstName() + '\''
        + ", lastname= '" + getLastName() + '\''
        + ", gender= '" + getGender() + '\''
        + ", studentId= '" + studentId + '\'' 
        + '}';
    }

    public boolean equals(Student s){
        if(this == s) return true;
        if(this == null || getClass() != s.getClass()) return false;
        if(!super.equals(s)) return false;
        Student student = (Student) s;

        return studentId == student.studentId;
    }
}

