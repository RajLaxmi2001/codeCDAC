package JavaBasic;

public class PassByReferrence {
	static class Person
	{
		String name;
		int age;
		
		Person(String name, int age)
		{
			this.name=name;
			this.age=age;
		}
	}
	public static void reference(Person p)
	{
		System.out.println("Before Modification "+p.name+"and"+p.age);

		p.name="Rajlaxmi";
		p.age=24;
		System.out.println("Before Modification "+p.name+"and"+p.age);
	}
	
	public static void main(String[] args) {
		Person p= new Person("Raj", 23);
		System.out.println("Before Modification "+p.name+" and "+p.age);
		reference(p);
		System.out.println("After Modification "+p.name+" and "+p.age);

	}
}
