import java.util.Scanner;

public class MicrowaveMenu {
	
		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the time");
			String time = scan.nextLine();
			
			if(time.length() <= 1){
				time = "00:0"+time;
			}
			if (time.length() <= 2){				

				time = "00:" + time;
			}
			if(time.length() > 2){
				String minutes = time.substring(0,time.length()-2);
				String seconds = time.substring(time.length()-2,time.length());
				time = minutes + ":" + seconds;
			}
			System.out.print(time);
		}

}
