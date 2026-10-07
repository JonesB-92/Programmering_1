package Opgave_2;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
	private char level;
	private int weeklyWaterHours;
	private int weeklyStrengthHours;

	//a. Implementer nu associeringen, givet at der kun er brug for at finde de tilknyttede svømmere
	//ud fra træningsplanen som angivet i UML diagrammet i denne opgave
	//Nu indeholder trainingplan svømmerne, som er knyttet til træningsplanen
	private ArrayList<Swimmer> swimmers;
	
	public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
		this.level = level;
		this.weeklyWaterHours = weeklyWaterHours;
		this.weeklyStrengthHours = weeklyStrengthHours;
		this.swimmers = new ArrayList<>();
	}
	
	public char getLevel() {
		return level;
	}
	
	public void setLevel(char niveau) {
		this.level = niveau;
	}
	
	public int getWeeklyStrengthHours() {
		return weeklyStrengthHours;
	}
	
	public void setWeeklyStrengthHours(int weeklyStrengthHours) {
		this.weeklyStrengthHours = weeklyStrengthHours;
	}
	
	public int getWeeklyWaterHours() {
		return weeklyWaterHours;
	}
	
	public void setWeeklyWaterHours(int weeklyWaterHours) {
		this.weeklyWaterHours = weeklyWaterHours;
	}


	//a. Implementer nu associeringen, givet at der kun er brug for at finde de tilknyttede svømmere
	//ud fra træningsplanen som angivet i UML diagrammet i denne opgave
	public ArrayList<Swimmer> getSwimmers(){
		return new ArrayList<>(swimmers);
	}

	public void addSwimmer( Swimmer swimmer){
		if(!swimmers.contains(swimmer)) {
			swimmers.add(swimmer);
		}
	}

	public void removeSwimmer(Swimmer swimmer){
		if(swimmers.contains(swimmer)) {
			swimmers.remove(swimmer);
		}
	}
	
}
