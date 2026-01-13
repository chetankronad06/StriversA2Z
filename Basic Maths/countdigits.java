/*
import java.util.*;
class countdigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		while(n>0){
			n/=10;
			count++;
		}
		System.out.print("no of digits are :" + count);

	}

}
*/

import java.util.*;
class countdigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = (int)(Math.log10(n)+1);
		System.out.print("no of digits are :" + count);

	}

}
