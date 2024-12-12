import java.util.Scanner;

import javax.swing.JOptionPane;


public class ChooseYourOwnAdventure
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
		System.out.println("Hello adventerer! Are you ready to begin your quest to get the enchanted sword?");
				String response = userInput.nextLine();
			System.out.println("Either way, you will go.");
		
		
				
			
				
			System.out.println("Your journey starts at a fork in the road, ahead of you are a cave and a forest path. Which wy will you go?");
			System.out.println("1. The cave");
			System.out.println("2. The Forest");
			int firstChoice = userInput.nextInt();
			if (firstChoice==1)
				{
					System.out.println("You enter the cave and see a big dog guarding a pedestal with a sword sticking out of it. He looks hungry... What do you do?");
					System.out.println("1. Throw a rock at him");
					System.out.println("2. Give him your lunch");
					int first1Choice = userInput.nextInt();
					if (first1Choice==1)
						{
							System.out.println("He starts growling and attacks you.");
							int randomNumber = (int) (Math.random()*2);
										
										if (randomNumber==0)
											{
												System.out.println("Try as you might, you cannot overcome him and your journey ends.");
											}
										
										else
											{
												System.out.println("You manage to fend him off with your sword, but not before you sustain bad injuries. You return home to heal and come back another day.");
											}
									
								
						}
					else if (first1Choice==2)
						{
							System.out.println("The dog swiftly and happily eats your lunch. You walk up to the pedastal, "
									+ "and pull the enchanted sword from the stone. You return home with your weapon, and a newfound best friend.");
						}
					else 
						{
							System.out.println("You picked a wrong number and combust from stupidity.");
						}
			
				}
			else if (firstChoice==2)
				{
					System.out.println("You walk into the forest and meet a camp of bandits with a treasure chest in one of their tents. What will you do?");
					System.out.println("1.Fight the Bandits");
					System.out.println("2.Sneak into the camp");
					int first2Choice = userInput.nextInt();
					if (first2Choice==1)
						{
							System.out.println("You announce your presence and you wish to fight. Where do you start?");
							System.out.println("1.Attack the ranged Bandit");
							System.out.println("2.Attack the knife Bandit");
							System.out.println("3.Attack the axe Bandit");
							int banditAttack = userInput.nextInt();
							
							
							
							
							
							
							
							
						}
					else if (first2Choice==2)
						{
							System.out.println("You sneak into the camp, crawling under boxes and sneaking behind tents.");
							int randomNumber = (int) (Math.random()*2);
							
							if (randomNumber==0)
								{
									System.out.println("However, as you sneak into the tent with the chest, you nock over a can, making a loud noise. The bandits are alerted, and your journey quickly ends.");
								}
							
							else
								{
									System.out.println("You successfully open the chest and discover the enchanted sword, leaving the camp with great success.");
								}
						}
				}	
			}
	}
