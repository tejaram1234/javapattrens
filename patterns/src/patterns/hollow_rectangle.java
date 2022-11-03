package patterns;

public class hollow_rectangle {

	public static void main(String[] args) {
		 int n=5;
		//int m=4;
		 for(int i=1;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 if(i==1||i==n-1||j==0||j==n-1) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}

}
