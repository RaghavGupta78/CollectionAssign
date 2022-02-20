import java.util.*;
class Person{
    public String firstName;
    public String lastName;
    public double salary;
    public String designation;
    public void addPerson(String firstName,String lastName,double salary,String designation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.designation=designation;
    }
    public void display(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(salary);
        System.out.println(designation);
        System.out.println();
    }

}
public class Employee {
    public static void main(String[] args) {


        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.addPerson("Raghav","Gupta",25000,"Trainee");
        p2.addPerson("Manav","Asija",21000,"Manager");
        p3.addPerson("Prateek","Sharma",23000,"IT");

        Map<Person,Double> map = new LinkedHashMap<Person,Double>();
        map.put(p1,25000.0);
        map.put(p2, 21000.0);
        map.put(p3, 23000.0);
        System.out.println();
        System.out.println("LINKED HASH MAP ");
        for(Person key: map.keySet()){
            System.out.println();
            System.out.println(key.firstName +"  "+ key.lastName +"  "+ key.designation);
            Double value = map.get(key);
            System.out.println(value);
            System.out.println();;
        }




    }



}
