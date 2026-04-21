
public class arraycopy {
  public static void main(String[] args) {
   String [] copyFrom= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u"};
   String [] copyTo=new String[7];
   System.arraycopy(copyFrom, 2,copyTo,0,7);
   for(String letter:copyTo) {
	   System.out.print(letter+" ");
   }
  }
}