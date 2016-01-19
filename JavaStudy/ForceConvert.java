/*
	Force convert, from int to byte 
	byte -128~127
	notation: the byte arrange(width) is 256
*/

class ForceConvert{
public static void main(String arg[]){
	int n = 129;

	byte c = (byte)n;
	n = c;
	
	System.out.println("n="+n);// n = -127, I think it is: 129-256=-127

	n = 257;

	c = (byte)n;
	
	System.out.print("n="+n);//n = 1; because 257%256 = 1
	
	}
}

