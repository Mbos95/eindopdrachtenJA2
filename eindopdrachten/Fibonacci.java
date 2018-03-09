package javaOpdrachtenA2.eindopdrachten;

public class Fibonacci {
	int index = 0;
	public long calcFibon(int input) {
			
		if(input == 0) {						// Als de input gelijk is aan 0 stopt de calculatie
			return 0;
		}else if(input == 1) {
			return 1;							// Als de input gelijk is aan 1 stopt de calculatie - einde berekening
		}else {
			return calcFibon(input - 1) + calcFibon(input - 2); // input = 5. calcFibon(5 -1) + calcFibon(5-2) ====== 4+3. roept zichzelf continue aan tot het eind product in zicht is.
		}
	}
	
	public void printFib(int inputUser) {
    	while(index < inputUser) {				 //While loop voor het printen. - draait totdat het gelijk is aan inputUser.
	    	System.out.println(calcFibon(index));//Print het resultaat wanneer calcFibon een nummer returned. de calculatie gaat door op de achtergrond.
	    	index++;							 //Index increasen zodat het geen on eindige loop word
    	}
	}
}
