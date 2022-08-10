import java.util.Scanner;
import java.util.Random;

class WaterSort {
	Character top = null;
	// create constants for colors
	static Character red= new Character('r');
	static Character blue = new Character('b');
	static Character yellow= new Character('g');
	// Bottles declaration
	
	
	public static void showAll( StackAsMyArrayList bottles[])
	{
		for (int i = 0; i<=4; i++)
		 {
			 System.out.println("Bottle "+ i+ ": " + bottles[i]);
		 }
	}
	
    public static void main(String args[])
    {
		 int moves = 0;// number of moves to mix the water
		 int source = 0; // number of bottle to pour FROM
		 int target = 0; // number of bottle to pour TO
		 int max = 4; // total number of items allowed per bottle
		 boolean solved = true;
		 
		 Random randomNum = new Random();
		 // Bottles declaration
		 StackAsMyArrayList bottles[] = new StackAsMyArrayList[5];
		 //You can do this with a for also
		 bottles[0] = new StackAsMyArrayList<Character>();
		 bottles[1] = new StackAsMyArrayList<Character>();
		 bottles[2] = new StackAsMyArrayList<Character>();
		 bottles[3] = new StackAsMyArrayList<Character>();
		 bottles[4] = new StackAsMyArrayList<Character>();
		 
		 //////STRATEGY #1
		 while (moves<4) // 4 moves per 3 colors = 12 moves required
        {
          // get source bottle
          target = randomNum.nextInt(max+1);
          while (bottles[target].getStackSize() == 4)// target is full
             {
               target = randomNum.nextInt(max);
             }
          bottles[target].push(blue);
		  target = randomNum.nextInt(max+1);
		  while (bottles[target].getStackSize() == 4)// target is full
             {
               target = randomNum.nextInt(max);
             }
          bottles[target].push(red);
		  target = randomNum.nextInt(max+1);
		  while (bottles[target].getStackSize() == 4)// target is full
             {
               target = randomNum.nextInt(max);
             }
          bottles[target].push(yellow);
          showAll(bottles);
          // increment valid moves
          moves++;
        }
		
		
		for (int i = 0; i <= 4; i++)
		{
			if((bottles[i].getStackSize() == 4) || (bottles[i].checkStackUniform()))
			{
				solved = true;
			}
			else
			{
				solved = false;
			}
		}
		
		while(!solved)
		{
			Scanner sourceB = new Scanner(System.in);
			System.out.println("Enter source bottle number: ");
		
			int sourceBottle = sourceB.nextInt();
		
			Scanner targetB = new Scanner(System.in);
			System.out.println("Enter target bottle number: ");
		
			int targetBottle = targetB.nextInt();
			
			if(bottles[targetBottle].getStackSize() == 4)
			{
				System.out.println("Target bottle is full.");
			}
			else if (bottles[sourceBottle].peek() == bottles[targetBottle].peek())
			{
				bottles[targetBottle].push(bottles[sourceBottle].pop());
			}
			else if(bottles[targetBottle].peek() == null )
			{
				bottles[targetBottle].push(bottles[sourceBottle].pop());
			}
			else if(bottles[sourceBottle].peek() != bottles[targetBottle].peek())
			{
				System.out.println("Colors don't match.");
			}
			
			showAll(bottles);
		}
    }
}