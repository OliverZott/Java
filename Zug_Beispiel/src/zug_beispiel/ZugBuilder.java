package zug_beispiel;

public class ZugBuilder extends Zug {
	
	
	// Builder Pattern implementation-test 1
	public ZugBuilder addSchiennefahrzeug(Schienenfahrzeug fahrzeug) {
		this.addSchiennfahrzeug(fahrzeug);
		return this;
	}
	public Zug build() {
		return new Zug();
	}
	
	// Builder Pattern implementation-test 2
	
}
