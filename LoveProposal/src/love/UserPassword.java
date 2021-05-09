
package love;
public class UserPassword{
	private String user;
	private String pass;
	private int sum;
	public int getPass()
	{
		return sum;
	}
	public void setPass(String user,String pass)
	{
		if((user.equals("LOVE")) && (pass.equals("MOHIT MANISHA"))) //Here you can change Id and Password as per your convenience
		{
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("--------------------------------Access Granted------------------------------------");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------------------");
			sum=2;
		}
		else
		{
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("----------------------------------Not access File---------------------------------");
			System.out.println("------------------You have no Id Pass then you are not access this file-----------");
			System.out.println("-------------------------------------Thank You------------------------------------");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("----------------------------------------------------------------------------------");
		}

	}

}
