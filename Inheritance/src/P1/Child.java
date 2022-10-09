package P1;

public class Child extends Parent{
	public void son()
	{
		System.out.println("I am Son");
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.GrandFather();
		obj.Father();
		obj.son();
	}

}
