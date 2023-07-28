package Encapsules;

public class Encapsule {
	private int id;
	private String name;
	private long mobile;
	private String address;
	
	

	public Encapsule() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public Encapsule(int id, String name, long mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	
	




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public long getMobile() {
		return mobile;
	}




	public void setMobile(long mobile) {
		this.mobile = mobile;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Encapsule [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}




	

}
