package week05.Inheritence;

public class Person{

    
    private String firstName;
    private String lastName;
    private String gender;


    public Person(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setGender(String gender) { 
        this.gender = gender; 
    }

    public String getGender() {
        return gender; 
    }

    @Override
    public String toString(){
        return "Person{" + 
        "firstname= '" + firstName + '\''
        + ", lastname= '" + lastName + '\''
        + ", gender= '" + gender + '\''
        + '}';
    }
   
    public boolean equals(Person p) { 
        if(this == p) return true;
        if(p == null || getClass() != p.getClass())  return false;
        Person person = (Person) p;

        return firstName.equals(person.firstName) && 
        lastName.equals(person.lastName) &&
        gender.equals(person.gender);
    }

}

