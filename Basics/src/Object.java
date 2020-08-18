
public class Object {
	String name;
	int id;
	public Object(String name , int id) {
		this.name=name;
		this.id=id;
		
	}
	public String getname() {
		return name;
	}
	public int getid() {
		return id;
	}
	
	public static void main(String[] args) {
		
		Object obj=new Object("Raja",12);
		String Name=obj.getname();
		int ID=obj.getid();
		System.out.println(Name);
		System.out.println(ID);
		
	}
}
