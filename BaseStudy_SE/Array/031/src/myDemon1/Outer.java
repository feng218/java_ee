package myDemon1;

public class Outer 
{
	private int i;
	public void outerMethod()
	{
		Inner a = new Inner("zhangsan",15);
		System.out.println(a.name);
		System.out.println("outerMethod");
	}
	class Inner
	{
		private String name;
		private int i;
		Inner(String name,int i)
		{
			this.name = name;
			this.i = i;
		}
		public void innerMethod()
		{
			System.out.println(this.name);
			System.out.println(this.i);
			System.out.println("innerMethod");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
}
