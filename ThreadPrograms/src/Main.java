
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Bhuvana");
		e.setSalary(123.4677);
		System.out.println("Original Object: "+e.getId()+"--"+e.getName()+"---"+e.getSalary());
		
		Employee e1=(Employee)e.clone();
		System.out.println("Clone Object: "+e1.getId()+"--"+e1.getName()+"---"+e1.getSalary());
		
		e.setName("rukmini");
		e.setSalary(5678.908);
		System.out.println("Original Object: "+e.getId()+"--"+e.getName()+"---"+e.getSalary());
		
		System.out.println("clone  Object: "+e1.getId()+"--"+e1.getName()+"---"+e1.getSalary());
		

	}

}
