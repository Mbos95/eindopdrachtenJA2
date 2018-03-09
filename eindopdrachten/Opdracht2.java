package javaOpdrachtenA2.eindopdrachten;

public class Opdracht2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	String userString ="Dit is een tekst met \" en ** en ?? "+"en * allerlei andere niet wenselijke tekens zoals ® etc.  "; // de ingevoerde string
    	Sanitize cleaner = new Sanitize();								// maak een nieuw sanitize object.
    	String endResult = cleaner.SanitizeInput(userString);			// stuur de string naar de sanitizer class - sanitize input methode.
    	System.out.println(endResult);									// print eind resultaat na het sanitizen
    }
 
}

