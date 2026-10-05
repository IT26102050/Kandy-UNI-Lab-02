public class IT26102050Lab2Q1   {
	
	public static void main(String[] args) {
		
		//perimeter = 2 * (length + width)
		//width = (3/4) * length
		//perimeter = 2 * (length + width) = 2 * (length + (3/4) * length) = 3.5 * length
		//length = perimeter / 3.5
		
	    double perimeter = 100;
		double length = perimeter / 3.5;
		double width = ( 3.0 / 4.0 ) * length;
		
	System.out.println("Length of the fence :" + length);
	System.out.println("Width of the fence : " + width);
	
	}

}	