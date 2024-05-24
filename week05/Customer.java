package week05;

class Main{
  
  public static void main(String[] args) {
    

    Customer customer = new Customer(872, "Jake McGinn", 'm');
    Account account = new Account(126, customer, 0.0);

      account.depozit(100);
      System.out.println(account);

      try{

      account.withdraw(50);
      System.out.println(account);

      account.withdraw(80);
      System.out.println(account);

      }catch(InvalidAmountException e){
            System.out.println(e.getMessage());
      }

  }
}

public class Customer {
  
    private int ID;
    private String name;
    private char gender;


    public Customer(int ID, String name, char gender){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public char getGender(){
      return gender;
    }

    @Override

    public String toString(){
      
      return name + " (" + ID + ") ";
    }

}


class Account{

  private int id;
  private Customer customer;
  private double balance = 0.0;

  public Account(int id, Customer customer, double balance){
      this.id = id;
      this.customer = customer;
      this.balance = balance;
  }

  public Account(int id, Customer customer){
      this.id = id;
      this.customer = customer;
  }

  public int getId(){  

    return id;
  }

  public Customer getCustomer(){

    return customer;
  }

  public double getBalance(){

    return balance;
  }

  public void setBalance(double balance){

    this.balance = balance;
  }

  @Override

  public String toString(){

    return customer + "balance=$" + String.format("%.2f", balance); 
  }

  public String getCustomerName(){

    return customer.getName();
  }

  public Account depozit(double amount){

    balance += amount;
    return this;
  }

  public Account withdraw(double amount) throws InvalidAmountException{

    if(balance >= amount){
      balance -= amount;
    }

    else {
      System.out.println("Amount withdrawn exceeds the current balance");
    }

    return this;
  }

}







