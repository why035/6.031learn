public class copyOfRange {
public static void main(String[]args) {
	String [] copyFrom= {"a","b","c","d","e","f","g","h","i","j"};
	String[]copyTo=java.util.Arrays.copyOfRange(copyFrom,2,9);
	for(int i=0;i<7;i++)
		System.out.println(copyTo[i]);
	
}
}
