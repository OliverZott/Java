package zug_beispiel;

public class ZugBuilder extends Zug {
	
	
	
	
	public ZugBuilder(Lokomotive lokomotive) {
		super(lokomotive);
		// TODO Auto-generated constructor stub
	}
	// Builder Pattern implementation-test 1
	public ZugBuilder addSchiennefahrzeug(Schienenfahrzeug fahrzeug) {
		this.addSchiennfahrzeug(fahrzeug);
		return this;
	}
	public Zug build(Lokomotive lok) {
		return new Zug(lok);
	}
	
	// Builder Pattern implementation-test 2
	
}
