//GameProgram.java
//Name: Kristi Hicks, hicksk2
import java.util.Scanner;
import java.util.ArrayList;

public class GameProgram {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Creature creature = new Creature();
		ArrayList <Creature> players = new ArrayList<>();
		String choice = "";
		System.out.println("Welcome to the Fantasy Game");
		System.out.println("1. Add the game players");
		System.out.println("2. Players play in turn until only one is left");
		System.out.println("Good Luck!");
		System.out.println("First, let's add some players: ");
		do{
		System.out.println("Enter player's name ('quit' when no more players): ");
		choice = input.next();
		System.out.println(choice + ", which species are you?");
		System.out.println("b/B: Balrog");
		System.out.println("c/C: Cyberdemon");
		System.out.println("e/E: Elf");
		System.out.println("h/H: Human");
		System.out.println("Select " + choice + "'s species:");
		String species = input.next();
		int strength = (int)(50*Math.random()) + 100;
		int hitp = (int)(10*Math.random()) + 10;
		creature.init(choice, species, strength, hitp);
		players.add(creature);
		//System.out.println("Enter player's name ('quit' when no more players): ");
		//choice = input.next();
		}while(!(choice.equalsIgnoreCase("quit")));
		
		System.out.println("Current Players:");
		System.out.println("NAME | SPECIES | STRENGTH | HIT POINTS");
		for(Creature c : players){
			System.out.println(creature);
		}
		creature.toString();
	}
}
/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Programming Homework 1
*
* Description:
*	This program simulates a creature game. It creates a creature with a hit point, strength,
*	name, and species. It also tells if the creature is dead or alive.
*   
* Bug Report:
*   None.
*/