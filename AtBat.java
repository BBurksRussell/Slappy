package baseball;
public class AtBat {
//Git Comment! Cocktails at 7!

// This is a POJO called AtBat. The test class will instantiate this class in order to populate an at bat during a simulated baseball game.
// This class will take several arguments, including pest itch count, and a random integer. These will help to return an outcome of an at bat, for example, 
// home run, hit, or strikeout.

	//initialize local variables
	int abno = 0;g
	int randno = 0;
	String [] atBatPoss = {"Strikeout","Hit","Score"};	//This string object is populated because we only want it to have discrete fields.
	//setters and getter generate local values for arguments passed from the test class.
	public int getAbno() {
		return abno;
	}

	public void setAbno(int abno) {
		this.abno = abno;
	}

	public int getRandno() {
		return randno;
	}

	public void setRandno(int randno) {
		this.randno = randno;
	}

	
	
	//AtBatPoss stands for 'At Bat Possibilities'. A random number (beginning with something from 1 to 3 or [0] to [2], 
	//will pick one of the few possibilities a batter might have when they go up to the plate. (this is not pitch by pitch,
	//this is what happens when the player leaves home plate.
	

			public String picker(int randno){
			String outcome = atBatPoss[randno];
			return outcome;
			}	
		}
