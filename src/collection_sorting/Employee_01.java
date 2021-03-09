package collection_sorting;

public class Employee_01 implements Comparable<Employee_01>{

    private Integer id;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + "]";
    }
 
    public int compareTo(Employee_01 o) {
        return this.getId().compareTo(o.getId());
    }
}
