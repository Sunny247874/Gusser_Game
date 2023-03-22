package project1;

import java.util.Scanner;

class Gusser
{
	 int GussNum;
	public int gussNumGusser()
	{
	        Scanner sc = new Scanner (System.in);
			System.out.println("kindly Guss the number by <--Gusseer-->");
			GussNum=sc.nextInt();
		
		
		return GussNum;
	}
}



class Player
{
	int playgessnum;
	
	public int gussNumPlay()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindlay guss the number by <--Player--> ");
		playgessnum=sc.nextInt();
		
		return playgessnum;
				
	}
}



class Umpire
{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	public void collectNumFromGusser()
	{
		Gusser g=new Gusser();
		numFromGusser=g.gussNumGusser();
	}
	
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.gussNumPlay();
		numFromPlayer2=p2.gussNumPlay();
		numFromPlayer3=p3.gussNumPlay();
	}
	
	void compare()
	{
		
		if(numFromGusser==numFromPlayer1)
		{
			System.out.println("Player1 won the Match");
			if(numFromGusser==numFromPlayer2)
			{
			   System.out.println("player 1 with Player2 won the Match");
			}
			else if(numFromGusser==numFromPlayer3)
			{
				System.out.println("player 1 with Player3 won the Match");
			}
			
		}
		else if(numFromGusser==numFromPlayer2)
		{
			System.out.println("player2 won the Match");
			if(numFromGusser==numFromPlayer3)
			{
				System.out.println("player 2 with player3 won the Match");
			}
		}
		else if(numFromGusser==numFromPlayer3)
		{
			  if(numFromGusser==numFromPlayer1)
			  {
				  
			  }
			System.out.println("Player3 won the Match");
		}
		else 
		{
			System.out.println("Gusser Number no match any player");
		}
	}
	
}

public class GusserGame {
public static void main(String args[])
{
	System.out.println("Game start");
	Umpire u=new Umpire();
	u.collectNumFromGusser();
	u.collectNumFromPlayer();
	u.compare();
}
}
