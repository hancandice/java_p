package jump2java;

public class ZooKeeper {
	
	public void feed(Predator predator) {
	    System.out.println("feed "+predator.getFood());	
	}
	
	/* public void feed(Tiger tiger) {
		System.out.println("feed tiger");
	}
	
	public void feed(Lion lion) {
		System.out.println("feed lion"); 
	} */
	
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(crocodile);
	}
}

// Method overloading
