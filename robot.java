import java.util.*;
/* This program was made for the practice and application of inner and outer classes. There are two hero
classes: Robots and Humans. Each have an inner class. Robots: Power_cores and Humans: Souls* While their inner
classes are unique their inheretence is the same from the Humanoid class Which gives them base stats as well
as allows them methods to attatch gear to improve their stats./

/* Robots have Power_cores which allow shield generation and recharge()*/
public class robot extends humanoid
{
	power_core core = null; //Automatically installed upon robot instantiation(construction)

	public robot(gear helmet, gear gloves, gear boots)
	{
		super(helmet, gloves, boots);

		this.hero = "Robot";
		this.attatch_gear(helmet, "Helmet");
		this.attatch_gear(gloves, "Gloves");
		this.attatch_gear(boots, "Boots");
		install_core(100, 25);

		base_stats(200, 10, 5);
	}

	public void recharge_shield()
	{
		core.recharge();
	}

	//Unique to robots (Shileds)
	private class power_core
	{
		public int curr_shield;
		public int max_shield;
		public int recharge_rate;

		private power_core(int max_shield, int recharge_rate)
		{
			this.curr_shield = max_shield;
			this.max_shield = max_shield;
			this.recharge_rate = recharge_rate;
		}

		public void recharge()
		{
			while (curr_shield < max_shield)
			{
				curr_shield = curr_shield + recharge_rate;
				System.out.println("Shield is recharging: " + curr_shield);
			}
			System.out.println("Shield is fully recharged!\n");
		}


		public void warning_shield()
		{
			if (curr_shield <= max_shield / 2)
				System.out.println("Shield is running low!.");
			else if (curr_shield <= 0)
				System.out.println("Shield has been depleted!.");
		}
	}


	public void install_core(int max_shield, int recharge_rate)
	{
		core = new power_core(max_shield, recharge_rate);
	}

	public static void main(String[] args)
	{
		//Robot Creation and gear attatchments
		robot my_robot = new robot(gear.titan_helmet(), gear.grinder_gloves(), gear.rocket_boots());
		my_robot.core.curr_shield = 0;
		my_robot.show_gear();

		//Human Creation and gear attatchments
		System.out.println("\nHumans Testing:");
		humans my_human = new humans(true, gear.titan_helmet(), gear.grinder_gloves(), gear.rocket_boots());
		my_human.show_gear();

		//Robot shield method
		System.out.println("\n--Robot Shield Method Test--");
		my_robot.recharge_shield();

		//Human soul method
		System.out.println("--Human Soul Method Test--");
		my_human.soul_ability();
	}
}
