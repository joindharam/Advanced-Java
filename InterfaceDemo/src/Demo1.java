
public class Demo1 {

	


public static void main(String[] args) {
	Child ch = new Child("Java", 101,"ABC",50);
	System.out.println(ch);
}

}
abstract class Parent{
	String name;
	int age;
	Parent(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("id called");
	}
}


class Child extends Parent{
	String sub;
	int eno;
	String name;
	int age;
public Child(String sub, int eno, String name, int age){
		super(name, age);
		this.sub=sub;
		this.eno=eno;	

	}
	@Override
	public String toString() {
		return "Child [sub=" + sub + ", eno=" + eno + ", name=" + super.name + ", age=" + super.age + "]";
	}
	
}
