public class humanoid
{
	int health;
	int power;
	int speed;

	String hero;
	gear helmet;
	gear gloves;
	gear boots;

	public humanoid(gear helmet, gear gloves, gear boots)
	{
		this.helmet = helmet;
		this.gloves = gloves;
		this.boots = boots;
	}

	public void base_stats(int health, int power, int speed)
	{
		this.health = health;
		this.power = power;
		this.speed = speed;
	}

	public void attatch_gear(gear chosen_gear, String origin)
	{
		origin = origin.substring(0,1).toLowerCase();
		
		if (origin.equals("h"))
			helmet = chosen_gear;
		else if(origin.equals("g"))
			gloves = chosen_gear;
		else if(origin.equals("b"))
			boots = chosen_gear;
	}

	//Used in show_gear()
	public void show_stats()
	{
		int total_power = 0;
		int total_speed = 0;

		total_power += helmet.power + gloves.power + boots.power + power;
		total_speed += helmet.speed + gloves.speed + boots.speed + speed;
		System.out.println("\nTotal power: " + total_power + "\n" + "Total speed: " + total_speed);
	}

	public void show_gear()
	{
		System.out.println("Hero: " + this.hero + " (power: " + this.power + ")" + 
		"(speed: " + this.speed + ")");

		System.out.println("Helmet: " + this.helmet.name + " (power: " + this.helmet.power + ")" +
			"(speed: " + this.helmet.speed + ")");

		System.out.println("Gloves: " + this.gloves.name + " (power: " + this.gloves.power + ")" +
			"(speed: " + this.gloves.speed + ")");

		System.out.println("Boots: " + this.boots.name + " (power: " + this.boots.power + ")" +
			"(speed: " + this.boots.speed + ")");

		show_stats();
	}
}