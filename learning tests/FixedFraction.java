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
		int x = 0;
		int y =0;
		int remainNom = 1;
		int remainDen = 1;
		int gc = 1;


		for(x=0; x <= newNum; x++){
			for(y=0; y <= newDen; y++){
				remainDen = newDen/y;
				if((remainDen ==0) &&(remainNom == 0) && (x == y)){
					gc = x;
				}
			}
			remainNom = newNum/x;
			
			
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
		System.out.println(Num + "/" + Den);
	}
}
