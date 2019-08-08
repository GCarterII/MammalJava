class GiantBat extends Mammal {
	public GiantBat() {
		this.changeEnergyLevel(200);
	}
	public void fly() {
		System.out.println("flap flap flap");
		this.changeEnergyLevel(-50);
	}
	public void eatHumans() {
		System.out.println("AAAHAHAHHAHAHHHHHHHHHHHHHHHHHHHHHHHHH");
		this.changeEnergyLevel(25);
	}
	public void attackTown() {
		System.out.println("SO HOT!!!");
		this.changeEnergyLevel(-100);
	}
}
