package assignment3_Composite;

import java.util.Set;
import java.util.HashSet;

public class Demo {

	public static void main( String[] args ) {
		CabinItem touchscreen = new CabinItem("Touchscreen", false);
		CabinItem kopfhoerer = new CabinItem("Bosekopfhörer", true);
		CabinItem hausschuhe = new CabinItem("Hausschuhe", false);
		CabinItem kuscheldecke = new CabinItem("Kuscheldecke", false);
		CabinItem schlummertrunk = new CabinItem("Schlummertrunk", true);
		CabinItem wifi = new CabinItem("Wifi", true);
		CabinItem telefon = new CabinItem("Telefon", false);
	
		
		CabinLayout entertainment = new CabinLayout("Entertainment");
		CabinLayout nightcare = new CabinLayout("Nightcare");
		CabinLayout business = new CabinLayout("Business");
		CabinLayout deluxe = new CabinLayout("Deluxe");
		
		entertainment.addItem(touchscreen);
		entertainment.addItem(kopfhoerer);
		
		nightcare.addItem(hausschuhe);
		nightcare.addItem(kuscheldecke);
		nightcare.addItem(schlummertrunk);
		
		business.addItem(wifi);
		business.addItem(telefon);
		business.addItem(wifi);
		
		deluxe.addItem(nightcare);
		deluxe.addItem(entertainment);
		deluxe.addItem(wifi);
		
		/*
		System.out.println("Business Class beinhaltet all diese Items: ");
		entertainment.traverse("");
		nightcare.traverse("");
		business.traverse("");
		*/
		
		System.out.println("Traverse over cabin layouts and items: ");
		System.out.println("");
		deluxe.traverse("");
		
		
		
		/*
		CabinLayout layout1 = new CabinLayout( "cabin1" );
		CabinLayout layout2 = new CabinLayout( "cabin2" );
		CabinLayout layout3 = new CabinLayout( "cabin3" );
		
		CabinItem headphone = new CabinItem("Headphone", true);
		CabinItem display = new CabinItem("Display", false);
		CabinItem phone = new CabinItem("Phone", false);
		CabinItem wifi = new CabinItem("Wifi", true);
		
		Set<CabinItem> set1 = new HashSet();
		
		
		layout1.setListOfCabinItem(set1);
		layout1.addItem(headphone);
		layout1.addItem(display);
		layout1.addItem(headphone);		// hashset --> only one of each item!

		layout1.traverse();
		 */
		
		
	}
}
