public class FixedFraction {

	public int numerator;
	public int denominator;

	public FixedFraction() {
		numerator = 1;
		denominator = 1;
	}

	public FixedFraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public FixedFraction add(FixedFraction other) {
		int newNum = numerator*other.denominator + other.numerator*denominator;
		int newDen = denominator*other.denominator;
		FixedFraction newFrac = new FixedFraction(newNum, newDen);
		
		numerator = newNum;
		
		denominator = newDen;
		return newFrac;
		

	}

	public String toString(){
		return numerator + "/" + denominator;
	}


	public static void frac1(int first, int second, int third, int fourth){
        int newNum = first*fourth + third*second;
		int newDen = second*fourth;
		int x = 2;
		int gc = 1;


		for(x=2; x <= newNum + newDen; x++){
			if((newNum % x == 0) && (newDen % x == 0)){
				gc = x;
			}
		}

        System.out.println("Solution:");
        System.out.println();
        System.out.println(first +  "     "+ third );
        System.out.println("_  +  _   = " +  newNum/gc + "/" + newDen/gc);
        System.out.println(second + "     "+ fourth);

		
    }

	public static void mult(int first, int second, int third, int fourth){
		int Den = second*fourth;
		int Num = first*third;
		int x =2;
		int gc = 1;
		System.out.println(Num + "/" + Den);

		for(x=2; x <= Num + Den; x++){
			if((Num % x == 0) && (Den % x == 0)){
				gc = x;
			}
		}

        System.out.println("Solution:");
        System.out.println();
        System.out.println(first +  "     "+ third );
        System.out.println("_  x  _   = " +  Num/gc + "/" + Den/gc);
        System.out.println(second + "     "+ fourth);


	}
}
