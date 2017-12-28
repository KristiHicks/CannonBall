//Creature.java
//Name: Kristi Hicks, hicksk2
public class Creature extends GameProgram{
	private int strength = 0;
	private int hitPoints = 0;
	private String name = "";
	private String species = "";
	private int tdamage = 0;
	
	public String getSpecies(){
		return species;
	}
	
	public void init(String newName, String newSpecies, int newStrength, int newHit) throws IllegalArgumentException{
		if(newStrength < 0 || newHit < 0 ){
		}
		strength = newStrength;
		hitPoints = newHit;
		if(newSpecies != "Balrog" || newSpecies != "Cyberdemon" || newSpecies != "Elf" || newSpecies != "Human"){
		}
		name = newName;
		species = newSpecies;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public void setHitPoints(int newHit) throws IllegalArgumentException{
		hitPoints = newHit;
	}
	
	public int getHitPoints(){
		return hitPoints;
	}
	
	public int getDamage(){
		int totalattack = 0;
		int totaldamage = (int) (Math.random()* 50) + 100;
		int bonus = 0;
		if(species == ("Belrog")){
			System.out.println("A Balrog hit twice");
			int 
		}
		return totaldamage;
	}
	
	public void Damage(int damage) throws IllegalArgumentException{
		tdamage = damage;
	}
	
	public boolean isDead(){
		if(strength == 0){
			return true;
		}
		return false;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isNamed(String aName){
		if (name == aName){
			return true;
		}
		return false;
	}
	
	public String toString(){
		String result = name;
		result += "|";
		result += species;
		result += "|";
		result += strength;
		result += "|";
		result += hitPoints;
		return result;
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