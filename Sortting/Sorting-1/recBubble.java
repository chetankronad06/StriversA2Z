class recBubble{
	private static int a = 69;
	recBubble(){
		System.out.println("recBubble class");
	}
	public static int sum(int a, int b){
		return a+b;
	}
	
	public static int unPrivate(){
		return a;
	}
}

class Main{
	public static void main(String[] args){
		
		System.out.println(recBubble.sum(2,3));
		System.out.println(recBubble.unPrivate());
		System.out.println(recBubble.a);
	}
}