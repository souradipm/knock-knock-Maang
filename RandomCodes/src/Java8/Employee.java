package Java8;

public class Employee {
	
	int id;
    String name;
    int managerId;

    public Employee(int id, String name, int managerId) {
        this.id = id;
        this.name = name;
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return name;
    }

}
