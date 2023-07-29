package Daythree3project;

public class Encapsulate {
	private int id=10;
	private long mobile=63830535;
	private String name="Vijai";
	private String Address="No:192 main road vikravandi.";
	public Encapsulate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Encapsulate(int id, long mobile, String name, String address) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.name = name;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Encapsulate [id=" + id + ", mobile=" + mobile + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
	

}
