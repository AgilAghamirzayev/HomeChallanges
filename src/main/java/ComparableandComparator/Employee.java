package ComparableandComparator;

import java.util.Arrays;
import java.util.Comparator;

public class  Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId(){
        return id;
    }

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee emp) {
        return (this.id - emp.id);
    }

    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]\n";
    }


    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }
    };

    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getAge() - o2.getAge());
        }
    };

    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10,"Aqil",20,10000);
        empArr[1] = new Employee(20,"Zeka",29,20000);
        empArr[2] = new Employee(5,"Nazrin",19,50000);
        empArr[3] = new Employee(1,"Ayan",24,30000);

        Arrays.sort(empArr);
        // id
        System.out.println("Default Sorting of Employees list: \n" + Arrays.toString(empArr));

        //salary
        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n" + Arrays.toString(empArr));

        //age
        Arrays.sort(empArr,Employee.AgeComparator);
        System.out.println("Employees list sorted by Age:\n" + Arrays.toString(empArr));

        //name
        Arrays.sort(empArr,Employee.NameComparator);
        System.out.println("Employees list sorted by Name:\n" + Arrays.toString(empArr));

        empArr[0] = new Employee(1,"Aqil", 20,23000);
        Arrays.sort(empArr,new EmployeeComparatorByIdAndName());
        System.out.println("Employees list of sorted by ID and Name\n"+Arrays.toString(empArr));
    }
}
