package pack1;

public class Department {
	private String dname;
	private int price;
	public String getEname() {
		return dname;
	}
	public void setEname(String dname) {
		this.dname = dname;
	}
	public int getRollno() {
		return price;
	}
	public Department(String dname, int price) {
		super();
		this.dname = dname;
		this.price = price;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setRollno(int price) {
		this.price = price;
	}
	

}
