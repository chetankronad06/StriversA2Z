import java.util.*;

class printName{
	private static void printName(String name, int count, int i ){
		if(count ==0){
			return;
		}
		System.out.println(name + i);
		printName(name , count-1 , i+1);
	}
	public static void main(String[] args){
		int count = 20;
		String name = "chetan";
		int i =0;
		printName(name , count,i);
		
	}
}