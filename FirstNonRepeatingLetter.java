package whatsappassign;



public class FirstNonRepeatingLetter {

	public static void main(String[] args) {
		String s="leetcode";
		System.out.println("The given string is: "+s);
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length(); j++) {
				if(i != j && s.charAt(i)!=s.charAt(j)) {
					System.out.println("The index value of the first non repeated character in the string is: "+i);
					break;
				}
			}
			break;
		}
		
	}

}
