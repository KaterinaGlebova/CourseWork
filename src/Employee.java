public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName(String name) {
        return name;
    }

    public int getDepartment(int department) {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Сотрудник " + id + " " + name + ", Отдел " + department + " , зарплата " + salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }
}
