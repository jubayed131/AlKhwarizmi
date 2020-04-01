import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String args[]){

        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee("Jessy","Pinkman",123));
        employeeList.add(new Employee("Walter","White",1245));
        employeeList.add(new Employee("Gus","Fing",789));
        employeeList.add(new Employee("Skyler","White",789));

//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
        employeeList.set(2,new Employee("Mike","Ehrmanstroup",787));

//        System.out.println(employeeList.size());
//        System.out.println(employeeList.isEmpty());
       // employeeList.forEach(employee -> System.out.println(employee));
        employeeList.add(3,new Employee("Gus","Fring",900));
        employeeList.forEach(employee -> System.out.println(employee));
//       Employee[] employeeArray=employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee:employeeArray
//             ) {
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new Employee("Walter","White",1245)));
        System.out.println(employeeList.indexOf(new Employee("Skyler","White",789)));

        employeeList.remove(3);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
