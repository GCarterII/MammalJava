
class Gorilla extends Mammal{
	public void throwSomething() {
		this.changeEnergyLevel(-5);
		System.out.println("This damn Gorilla keeps throwing things!");
	}
	public void eatBananas() {
		this.changeEnergyLevel(10);
		System.out.println("This damn Gorilla keeps eating my bananas!");
	}
	public void climb() {
		this.changeEnergyLevel(-10);
		System.out.println("This damn Gorilla is climbing the walls!");		
	}
}
