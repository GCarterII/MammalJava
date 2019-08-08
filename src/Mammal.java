
public abstract class Mammal {
	private int energyLevel = 0;

	public int displayEngergy(){
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public void changeEnergyLevel(int energyLevelChange) {
		this.energyLevel += energyLevelChange;
	}

}
