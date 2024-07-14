package practice_priyankaK24;

public class practiceStringMethods{
	
	void printData(String inputString) {
		for (int index=0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			if (Character.isDigit(ch))
				System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		practiceStringMethods p1 = new practiceStringMethods();
		p1.printData("88888hhhh4567h");
	}
}
