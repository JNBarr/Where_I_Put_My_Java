public class Switching {

	public static void main(String args[]) {
		char grade = 'C';
		
		switch(grade) {
			case 'A' :
				System.out.println("100%"); 
				break;
			case 'B':
			case 'C':
				System.out.println("80%");
				break;
			case 'D':
				System.out.println("60%");
			case 'F':
				System.out.println("40%");
				break;
			default :
				System.out.println("Below 40%");
		}
		System.out.println("You achieved " + grade);
	}
}