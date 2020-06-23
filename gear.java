/*Gear that increases stats of the heros who may attatch them increasing their power and speed. */
public class gear
{
	String name;
	int power;
	int speed;


	public gear(String name, int power, int speed)
	{
		this.name = name;
		this.power = power;
		this.speed = speed;
	}


	//Helmets
	public static gear titan_helmet()
	{
		gear titan_helmet = new gear ("Titan Helmet", 5, 5);
		return titan_helmet;
	}

	//Gloves
	public static gear grinder_gloves()
	{
		gear grinder_gloves = new gear("Grinder Gloves", 10, 0);
		return grinder_gloves;
	}

	//Boots
	public static gear rocket_boots()
	{
		gear rocket_boots = new gear("Rocket Boots", 0, 5);
		return rocket_boots;
	}

}