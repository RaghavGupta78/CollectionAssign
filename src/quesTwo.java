import java.util.*;
class SortSal implements Comparator<Double> {


    public int compare(Double sal1,Double sal2)
    {
        if(sal2>sal1){
            return 1;
        }
        else if(sal2<sal1){
            return -1;
        }
        else{
            return 0;
        }

    }
}
class Employees{
    public String firstName;
    public String lastName;
    public double age;
    public double salary;
    public Employees(String firstName,String lastName,double age,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;

    }

}
public class quesTwo {
    public static void main(String[] args) {
        Employees e1 = new Employees("Raghav","Gupta",21,21000);
       // e1.firstName="raghav";
       // e1.lastName="gupta";
       // e1.age=21;
       // e1.salary=21000;

        Employees e2 = new Employees("Aman","Sharma",23,20000);
       // e2.firstName="aman";
        //e2.lastName="sharma";
        //e2.age=23;
        //e2.salary=20000;

        Employees e3 = new Employees("Mihir","Asija",24,25000);
        //e3.firstName="mihir";
        //e3.lastName="asija";
        //e3.age=24;
        //e3.salary=25000;

        //Default sorting on first name
        Set<String> set1 = new TreeSet<String>();
        System.out.println("SORTING BASED ON FIRST NAME");
        set1.add(e1.firstName);
        set1.add(e2.firstName);
        set1.add(e3.firstName);

        for(String element:set1){
            System.out.println(element);
        }
        System.out.println();

        //default sorting on last name
        Set<String> set2 = new TreeSet<String>();
        System.out.println("SORTING BASED ON LAST NAME");
        set2.add(e1.lastName);
        set2.add(e2.lastName);
        set2.add(e3.lastName);

        for(String element:set2){
            System.out.println(element);
        }


        List<Double> sal = new ArrayList<Double>();
        sal.add(e1.salary);
        sal.add(e2.salary);
        sal.add(e3.salary);


        List<Employees> employeesList = new ArrayList<Employees>();
        employeesList.add(new Employees("Raghav","Gupta",21,21000));
        employeesList.add(new Employees("Aman","Sharma",23,20000));
        employeesList.add(new Employees("Mihir","Asija",24,25000));



        Comparator<Employees> comp = new Comparator<Employees>() {
            @Override
            public int compare(Employees e1, Employees e2) {
                if(e1.salary<e2.salary)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(employeesList,comp);
        System.out.println();
        System.out.println("BASED ON SALARY");
        System.out.println();
        for(Employees e:employeesList){
            System.out.println();
            System.out.println(e.salary);
            System.out.println(e.firstName);
            System.out.println(e.lastName);
            System.out.println(e.age);
        }



    }
}
