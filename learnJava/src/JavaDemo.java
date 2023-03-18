import com.itheme.chapter04.Employee;

public class JavaDemo {

    public static void main(String[] args) {
        Employee emp=new Employee(7369L,"史密斯",3000,0.3);
        System.out.println(emp.getInfo());
        System.out.println("工资调整额度："+emp.salaryIncValue());
        System.out.println("上调后的工资"+emp.salaryIncResult());

    }
}
