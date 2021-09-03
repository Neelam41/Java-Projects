package duplicate;

import java.util.Random;
import java.util.Scanner;

public class tictactoe {
	public static tictactoe obj = new tictactoe();
	static char [][]car = {{'1','|','2','|','3'},
			{'-','+','-','+','-'},{'4','|','5','|','6'},
			{'-','+','-','+','-'},{'7','|','8','|','9'}};
	static Scanner sc = new Scanner(System.in);
	static int no =1;
	static String player1,player2;
	static char symbol1= 'X',symbol2='O';
	public static boolean a=true,b=true,z=true;
	static Random rand = new Random();
	public static int rand1;
	
	public static void main(String[] args) {
		System.out.println("            **********        TIC-TAC-TOE       **********        ");
		System.out.println();
		System.out.println();
		System.out.println("ENTER UR CHOICE");
		System.out.println();
		System.out.println("1: Single  player             2: Multiplayer              3:Exit game");
		int plyr = sc.nextInt();
		switch(plyr) {
		case 1:
			System.out.println();
			System.out.print("Player's name:\t");
			player1=sc.next();
			System.out.println();
			 gameboard(car);
			
			 
			while(a) {
				
				System.out.println();
				System.out.println(player1+"'s chance"+symbol1);
				System.out.print("enter position(1-9):");
				int pos = sc.nextInt();

				placepiece(car,pos,symbol1);
				ZZZZZZ(car,symbol1,player1);
				
				System.out.println("cpu's choice--"+symbol2);
				rand1 = rand.nextInt(9)+1;
				System.out.println(rand1);
				 random(car,symbol2,rand1);
				 ZZZZZZ(car,symbol2,"CpU");
			     gameboard(car);
			    
			   }
			
		break;

		case 2:
			
			 System.out.print("Player1's name:");
		  player1= sc.next();
		 System.out.print("Player2's name:");
		  player2 = sc.next();
		  gameboard(car);
		  System.out.println();
		 
		  while(a) {
				System.out.println();
				 System.out.println(player1+"'s chance:");

				 System.out.print("enter position(1-9):\t") ;
					int pos = sc.nextInt();

			placepiece(car,pos,symbol1);
			ZZZZZZ(car,symbol1,player1);
			System.out.println(player2+"'s chance:");
			System.out.print("enter position(1-9)") ;
			int pos1 = sc.nextInt();
			placepiece(car,pos1,symbol2);
			ZZZZZZ(car,symbol2,player2);
			  gameboard(car);         
			  
			 
			 }
		    break;
		 case 3:
			 System.exit(1);
		
	    default:
	    	break;
		
		}
				}  

	public static void gameboard(char[][] g) {
		for(char[] row:g) {
       	 for(char c : row) {
       		 System.out.print(c);
       	 }
       	 System.out.println();
         }

	}

	  public static void random(char car[][],char symbol,int rand1) {
		
		 while(b) {
		 switch(rand1) {
		 case 1:
			 if(car[0][0]==symbol1||car[0][0]==symbol2){
				 rand1 = rand.nextInt(9)+1;
			 }
			 else{
				 System.out.println(rand1);
                 car[0][0]=symbol;
                 b=false;
		    }
			 break;
		 case 2:
			 if(car[0][2]==symbol1||car[0][2]==symbol2){
				 rand1 = rand.nextInt(9)+1;
			 }
			 else{
				 System.out.println(rand1);
                 car[0][2]=symbol;
                 b=false;
			 
		 			 }
			 break;
		 case 3:
			 if(car[0][4]==symbol1||car[0][4]==symbol2){
				 rand1 = rand.nextInt(9)+1;
				
			 }
			 else{
				 System.out.println(rand1);
                 car[0][4]=symbol;
                 b=false;
				
		 			 }
			 break;
		 case 4:
			 if(car[2][0]==symbol1||car[2][0]==symbol2){
				 rand1 = rand.nextInt(9)+1;
				
			 }
			 else{
				 System.out.println(rand1);
                 car[2][0]=symbol;
                 b=false;
		   }
			 break;
		 case 5:
			 if(car[2][2]==symbol1||car[2][2]==symbol2){
				 rand1 = rand.nextInt(9)+1;
				 
			 }
			 else{
				 System.out.println(rand1);
                 car[2][2]=symbol;
                 b=false;
			    }
			 break;
		 case 6:
			 if(car[2][4]==symbol1||car[2][4]==symbol2){
				 rand1 = rand.nextInt(9)+1;
			 }
			 else{
				 System.out.println(rand1);
                 car[2][4]=symbol;
                 b=false;
		       }
			 break;
		 case 7:
			 if(car[4][0]==symbol1||car[4][0]==symbol2){
				 rand1 = rand.nextInt(9)+1;
			
			 }
			 else{
				 System.out.println(rand1);
                 car[4][0]=symbol;
                 b=false;
             
		 			 }
			 break;
		 case 8:
			 if(car[4][2]==symbol1||car[4][2]==symbol2){
				 rand1 = rand.nextInt(9)+1;
			 }
			 else{
				 System.out.println(rand1);
                 car[4][2]=symbol;
                 b=false;
		 			 }
			 break;
		 case 9:
			 if(car[4][4]==symbol1||car[4][4]==symbol2){
				 rand1 = rand.nextInt(9)+1;
			 }
			 else{
				 System.out.println(rand1);
                 car[4][4]=symbol;
                 b=false;
                 }
			 break;
			 default:
				 
				 break;

		 }
		 }
		 
	 }
	 public static void placepiece(char[][] car,int posz,char symbol) {
		while(z) {	
	 switch(posz) {
		  case 1:
			
			  if(car[0][0]==symbol1||car[0][0]==symbol2){
				  System.out.println("place occupied--choose another place");
				   posz=sc.nextInt();
			    // car[0][0].replace(valueAt(car[0][0]),symbol);//check----***;;
			  }
			  else {
				  car[0][0]=symbol;
				  z=false;
				 
			  }
			  break;
		  case 2:
			 
			  if(car[0][2]==symbol1||car[0][2]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
				
			  }else {
				  car[0][2]=symbol;
				  z=false;
			  }
				  break; 
			  
		  case 3:
			 
			  if(car[0][4]==symbol1||car[0][4]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
		
			  }
			  else {
				  car[0][4]=symbol;
				  z=false;
				  }
			  break;
		  case 4 :
			  if(car[2][0]==symbol1||car[2][0]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
			   
			  }else {
				  car[2][0]=symbol;
				  z=false;
			  }
				  break; 
				 
			
		  case 5:
			 
			  if(car[2][2]==symbol1||car[2][2]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
			
			  
			  }else {
				  car[2][2]=symbol;
				  z=false;
			  }
				  break;
			  
		  case 6:
			  
			  if(car[2][4]==symbol1||car[2][4]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
				
			  }else {
				  car[2][4]=symbol;
				  z=false;
			  }
				  break; 
		  case 7:
			
			  if(car[4][0]==symbol||car[4][0]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
				  
			   }
			  else {
				  car[4][0]=symbol;
				  z=false;
	     			
	     	 }
			 break;
		  case 8:
		
			  if(car[4][2]==symbol1||car[4][2]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
			  }else { 
				  car[4][2]=symbol;
				  z=false;
			  }
				  break;
			  
		  case 9:
			 
			  if(car[4][4]==symbol1||car[4][4]==symbol2) {
				  System.out.println("place occupied--choose another place");
				  posz=sc.nextInt();
				
			  }else {
				  car[4][4]=symbol;
				  z=false;
			  }
				  break;
			  
		  default:
			  System.out.print("Invalid position");
			  posz=sc.nextInt();
			  break;
			
	 }
		}		
	}

	

	public static void ZZZZZZ(char[][] car,char symbol,String player) {
		  if(car[0][0]==symbol && car[0][2]==symbol && car[0][4]== symbol) {
			  System.out.println("*******         W-I-N-N-E-R__W-I-N-N-E-R      *******   ");
			  System.out.println("  \t "+player+" --wins  ");
			  gameboard(car);
			  System.out.println();
			  System.out.print("GAME ENDS");
			  System.exit(1);
			 // a=false;
			  
		  }else if(car[2][0]==symbol && car[2][2]==symbol && car[2][4]==symbol) {
			  System.out.println("******          W-I-N-N-E-R__W-I-N-N-E-R       *******");
			  System.out.println("    "+player+" --wins  ");
			  gameboard(car);
			  System.out.println();
			  System.out.print("GAME ENDS");
			  
			 // a=false;
			  System.exit(1); 
		  }else if(car[4][0]==symbol && car[4][2]==symbol && car[4][4]==symbol) {
			  System.out.println("********        W-I-N-N-E-R__W-I-N-N-E-R       *******");
			  System.out.println("        "+player+" --wins");
			  gameboard(car);
			  System.out.println();
			  System.out.print("GAME ENDS");
			  
			 // a=false;
			  System.exit(1);
		  }else if (car[0][0]==symbol && car[2][2]==symbol && car[4][4]==symbol) {
			  System.out.println("*********       W-I-N-N-E-R__W-I-N-N-E-R       *******");
			  System.out.println("       "+player+" --wins");
			  gameboard(car);
			  System.out.println();
			  System.out.print("GAME ENDS");
			  System.exit(1);
			 // a=false;
			  System.exit(1);
		  }else if(car[4][0]==symbol && car[2][2]==symbol && car[0][4]==symbol) {
			  System.out.println("***********       W-I-N-N-E-R__W-I-N-N-E-R    ********");
			  System.out.println("   "+player+" --wins  ");
			  gameboard(car);
			  System.out.println();
			  System.out.print("GAME ENDS");
			
			 // a=false;
			  System.exit(1);
		  } else {
			  System.out.println();
		  }
			  
	}
	
	
}
