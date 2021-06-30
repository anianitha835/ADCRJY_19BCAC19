public class odd{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int temp,rem;
		    while(n>0) {
		    	
		    	rem=n%10;
		    	if(rem%2!=0) {
		    		System.out.println(rem);
		    		
		    	}
		    	n/=10;
		    	
		    	
		   }
		   
		    
		   
	}
	

} 



otput:
 1234

1
3