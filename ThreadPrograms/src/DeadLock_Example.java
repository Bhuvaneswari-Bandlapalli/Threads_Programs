
public class DeadLock_Example {
	public static final String name1="prabhas";
	public static final String name2="kajol";
	public void m1(String name1) {
		synchronized(name1) {
		System.out.println("m1 method call  "+name1);
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (name2) {
			System.out.println("m1 method call "+name2);
			
		}
		}
	}
	public void m2(String name2) {
		synchronized(name2) {
		System.out.println("m2 method call  "+name2);
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (name1) {
			System.out.println("m2 method call "+name1);
			
		}
		}
	}

	public static void main(String[] args) {
		DeadLock_Example d=new DeadLock_Example();
		Thread t=new Thread() {
			public void run() {
				d.m1(name1);
			}
		};
		t.start();
		Thread t1=new Thread() {
			public void run() {
				d.m2(name2);
			}
		};
		t1.start();

	}

}
