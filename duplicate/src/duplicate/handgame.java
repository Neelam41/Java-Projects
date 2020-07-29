package duplicate;

//import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class handgame {
	 static String[] box = {"_"," ","|"," ","_"};
	   public static Scanner sc =new Scanner(System.in);
	   static Random rand = new Random();
	   static int option,count1=0,count2=0;
	public static boolean b=true;
   
  
   
	public static void main(String[] args) {
	
		 String player1;
	System.out.println("Enter ur choice:");
	
	System.out.println("\t\t1.Play  |   2.exit");
	
	 
	int value=sc.nextInt();
	
	System.out.println();
	switch(value) {
	 case 1:
		 System.out.print("how many times u wanna play:\t");
			int times = sc.nextInt();
		 System.out.println("hello Player!! Enter ur name:");
			player1=sc.next();
			System.out.println();
			while(times>0)
			{
		     choice(box);
		     board(box,player1);
		     --times;
			}
			 System.out.println();
			winner(player1);
			break;
	
	case 2:
		System.exit(1);
	}
	}

	
	
	
	
    public static void choice(String[] car ) {           //CHOICE METHOD
    	int random;
    	System.out.println("Enter hand sign"+"\t"+":");
		System.out.println("1.STONE (👊)"+"\t"+"2.PAPER (🖐)"+"\t"+"3.SCISSOR (✌️)");
	     option =sc.nextInt();
	     b=true;
	     while(b) {
   switch(option) {
	    case 1:
	    	 car[0]="STONE(👊)";
	    	random= rand.nextInt(3)+1;
	    	if(random==2) {
	        car[4]="PAPER(🖐)";
	    	} else if(random==3) {
	    		car[4]="SCISSORS(✌️)️";
	    	
	    	}else
	    		{car[4]="STONE(👊)";}
             b=false;
	    	break;
	    case 2:
	    	car[0]="PAPER(🖐)";
	    	random= rand.nextInt(3)+1;
	   
	    
	    	if(random==1) {
	        car[4]="👊";
	       
	    	} else if(random==3) {
	    		car[4]="SCISSORS(✌️)️";
	    	
	    	}else
	    		{car[4]="PAPER(🖐)️";}
	    		
	    	b=false;
	    	break;
	    case 3:
	    	car[0]="SCISSORS(✌️)️";
	    	random= rand.nextInt(3)+1;
	    	
	    	if(random==2) {
	        car[4]="PAPER(🖐)";
	        
	    	} else if(random==1) {
	    		car[4]="STONE(👊)";
	    		
	    	}else
	    		{car[4]="SCISSORS(✌️)️";}
	    	b=false;
	    	break;
	    default:
	    	System.out.print("Enter valid sign:");
	    	System.out.println();
	    	option =sc.nextInt();
	        break;
	    }
	     }
   
   if(box[0]=="STONE(👊)"&& box[4]=="SCISSORS(✌️)️"||box[0]=="SCISSORS(✌️)️"&& box[4]=="PAPER(🖐)"||box[0]=="PAPER(🖐)"&& box[4]=="STONE(👊)")
		
	   count1++;
	 
	 else if(box[4]=="STONE(👊)"&& box[0]=="SCISSORS(✌️)️"||box[4]=="SCISSORS(✌️)️"&& box[0]=="PAPER(🖐)"||box[4]=="PAPER(🖐)"&& box[0]=="STONE(👊)")
	  count2++;
	
  }
    
    
    
      
	
 public static void board(String[] box,String player) {        //BOARD METHOD
       	 for(String c : box) {
       		 System.out.print("\t  "+c);
       	 }
       	 System.out.println();
       	 System.out.println("\t\t\t"+player+"("+count1+")\t  "+ "VS\t "+"CPU("+count2+")");
         
 }
 
 
 
  public static void winner(String player1) {    //WINNER METHOD
	 if(count1>count2) {
		 System.out.println("\tWinner:\t"+player1+"\t(by "+(count1-count2)+"points)");
	 }
	 else if(count1<count2) {
		 System.out.println("\tWinner:\tCPU"+"\t(by"+(count2-count1)+"points)");
	 }else {
		 System.out.println("\t\tTIE");
	 }
 }
}
