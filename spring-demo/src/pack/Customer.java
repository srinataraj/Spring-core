package pack;

public class Customer {
	private Identifier id;
	@AutoWired
	private Address address;
	public Customer() {
		super();
		System.out.println("Customer() is called");
		// TODO Auto-generated constructor stub
	}

	public Customer(Identifier id) {
		super();
		System.out.println("Customer(Identifier) is called");
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		System.out.println("setId() is called");
		this.id = id;
	}
	public void getInformations() {
		id.display();
	}

}
