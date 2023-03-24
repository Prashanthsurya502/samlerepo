//write the program to print the pattern as java
class Javapattern extends Thread
{
	public static void main(String[] args) throws Exception
	{
		Thread t=new Thread();
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			t.sleep(2000);
			for (int j=0;j<n ;j++ )
			{
				if(i==0 ||j==n/2 || i==n-1 && j<=n/2)
				{
				System.out.print("* ");
	
				}
				else
				{
				System.out.print("  ");
	
				}

			}
			for (int j=0;j<n ;j++ )
			{
				if(i==0 || i==n/2 || j==0 || j==n-1)
				{
				System.out.print("* ");
	
				}
				else
				{
				System.out.print("  ");
	
				}

				
			}
			for (int j=0;j<n ;j++ )
			{
				if(j==0 && i<=n/2 || j==n-1 && i<=n/2 || i==3 && j==1 || i==3 && j==3 || i==4 && j==2)
				{
				System.out.print("* ");
	
				}
				else
				{
				System.out.print("  ");
	
				}

				
			}

			for (int j=0;j<n ;j++ )
			{
				if(i==0 || i==n/2 || j==0 || j==n-1)
				{
				System.out.print("* ");
	
				}
				else
				{
				System.out.print("  ");
	
				}

				
			}
			System.out.println();
		}
		
	}
}
