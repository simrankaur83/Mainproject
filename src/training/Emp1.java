package training;

public class Emp1 {
	int Empid;
	String Empcode;
	test address;
	public Emp1(int Empid, String Empcode,test address) {
		this.Empcode=Empcode;
		this.Empid=Empid;
		this.address=address;
	}
		void display() {
			System.out.println(address.city);
			System.out.println(address.state);
			System.out.println(address.country);
		}
		public static void main(String[] args)
		{
			test address1=new test("gzb","UP","india");  
			test address2=new test("gno","UP","india");  
			Emp1 e1=new Emp1(23,"iop",address1);
			Emp1 e2=new Emp1(24,"klk",address2);
			e1.display();
			e2.display();
		}
	}

