
public class MutableInt {
	int myVal; 
	int val() { return(myVal); }
	public MutableInt(int i ) {
	myVal=i; 
	}
	public void increment(int i) { myVal+=i;}; 
	
}