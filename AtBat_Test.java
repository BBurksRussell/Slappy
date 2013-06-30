//this line points to the packages in which all the needed methods and collections reside.
package baseball;
import java.util.ArrayList;
import java.util.List;

//import the random number gen
import java.util.Random;

//declaring the name of this class, it's a test class to make sure that elements of
//AtBat are working.
public class AtBat_Test {

	//This line begins the execution of the main method.
	public static void main(String[] args) {
		
		//This line instantiates an object of ArrayList, called inningList. It holds object of type String. 
		List<String>inningList = new ArrayList<String>();
				
		//This is the beginning of a loop that will iterate through at bat numbers (abno). Each subsequent 
		//action inside the braces represents every time a player comes up to bat.
		//each player will either score, get a hit, or get strikeout.
		for (int abno = 0; abno< 5; abno++){
			
			//each time the "at bat number" or abno loop iterates, it instantiates an object of
			//AtBat, called atBatObject. This object wil hold the data of the player's appearance at the plate
			//including, Balls, Strikes, Fouls. For now, in the planning stages of this program, it will only hold
			//the result of the at bat.
			AtBat atBatObject = new AtBat();
			
			//each time the abno loop iterates, it instantiates an object of Random, called rgen.
			//rgen will be passed to the picker method to pick an outcome for the at bat.
			Random rgen = new Random();
	
			//this line states the parameters for the object randno. If there are four options in
			//the atBatPoss[], then the limit is for indexes 0,1,2,3. The 3 is the argument for
			//the method nextInt below.
			int randno = rgen.nextInt(3);
			
			//Here we see the ArrayList populated with the results of the player's appearance.	
			inningList.add(atBatObject.picker(randno));
			
			
			}
	
	//Print the outcome of the plate appearances.
	System.out.println(inningList);
	}

}
