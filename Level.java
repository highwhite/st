public class Level
{
	static int level;
	public static int getLevel()
	{
		return level;
	}
	public static void addLevel()
	{
		if (level < 8)
		{
			level++;
		}
		System.out.println("level:"+level);
	}
	public static void initLevel()
	{
		level = 0;
	}
}