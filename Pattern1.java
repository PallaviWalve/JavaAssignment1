package assignment;

import java.util.Scanner;

public class Pattern1
{
			public static void main(String[] args)
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("enter number to print rectangle pattern");
		        int n=sc.nextInt();

				for(int i=n; i>0; i--)
				{
					for (int space=i;space<n;space++)
					{
						System.out.print("  ");
					}
					for (int j = 0; j<i; j++) 
					{
						System.out.print(" * ");
					}
					System.out.println(" ");
				}

			}

	}
