import java.util.Scanner;
import java.io.*;


public class TitleApplier {
	public static void main (String[] arg){
		
		String line = null;
		Scanner scan = new Scanner( System.in );
		
	
			
			System.out.println("Enter a name");
			String[] girlName = {"Amy","Cathy","Buffy"};
			String[] boyName = {"Elroy","Fred","Graham"};
			String[] nothing = {""};
			line = scan.nextLine();
			
			while(line.length() > 0){
				
				for(String x : girlName){
					if (line.startsWith(x)){
						
						System.out.println("Ms"+ " " + x);
					}
				
			}
				for(String y : boyName){
					if(line.startsWith(y)){
						
						System.out.println("Mr" + " " + y);
					}
				}
				for(String z : nothing){
					if(line.startsWith(z)){
						break;
					}
				}
		}
		
	}
}

