
public class Demo {

	public static void main(String[] args) {
		C c = new C("Java", 101,"ABC",50);
		System.out.println(c);
	}

}
abstract class P{
	String name;
	int age;
}


class C extends P{
	String sub;
	int eno;
	public C(String sub, int eno, String name, int age){
		this.sub=sub;
		this.eno=eno;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "C [sub=" + sub + ", eno=" + eno + ", name=" + name + ", age=" + age + "]";
	}
	
	
}