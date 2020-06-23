
/*Humans all have souls. If their soul is_good then they have extra health, if their soul
is not_good they have extra power. */
public class humans extends humanoid
{	
	boolean is_good;
	souls soul;

	int health_buff = 50;
	int power_buff = 10;

	public humans(boolean is_good, gear helmet, gear gloves, gear boots)
	{
		super(helmet, gloves, boots);
		this.hero = "Human";
		this.is_good = is_good;
		
		base_stats(200, 5, 5);
		soul = new souls(this);

	}

	public void soul_ability()
	{
		soul.soul_ability();
	}

	private class souls
	{
		humans human;

		private souls(humans human)
		{
			this.human = human;
		}

		public void soul_ability()
		{
			System.out.println(human.is_good);
			if (human.is_good)
			{
				System.out.println("This humans soul is good and thus a health buff is added.\n" +
					"Before buff: " + human.health);
				human.health = human.health + human.health_buff;
				System.out.println("After buff: " + human.health);
			}
			else
			{
				System.out.println("This humans soul is bad and thus a power buff is added.\n" +
					"Before buff: " + human.power);
				human.power += human.power_buff;
				System.out.println("After buff: " + human.power);
			}
		}
	}
}