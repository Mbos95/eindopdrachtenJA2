package javaOpdrachtenA2.eindopdrachten;

public class Sanitize {
		public String SanitizeInput(String inputFromUser) {
			char[] weg = {'"','?','*','®','\\'};					// array met alle uitgesloten characters
			StringBuilder sb=new StringBuilder(inputFromUser);  	// stringbuilder object maken van de aangeleverde string.
			for(int i = 0;i < sb.length(); i++) {					// loop over de string lengte.
				for(int y = 0; y < weg.length; y++) {				// loop over de char array met alle "not-allowed" characters
					if(sb.charAt(i) == weg[y]) {	
						sb.setCharAt(i, ' ');						// als character in string gelijk is aan een waarde in char - een spatie neerzetten	
					}
				}
			}
			return sb.toString();									// return santized string naar de main methode van het programma om verder bewerkt te worden.
		}
}
