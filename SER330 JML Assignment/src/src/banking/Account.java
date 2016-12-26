package src.banking;


/**
 * This class implements the functionality of a banking account component.
 *
 */
public class Account
{
	/**
	 * The balance of the account.
	 */
	private double bal;
	
	/**
	 * The first name of the account owner.
	 */
	private String ownerFirstName;
	
	/**
	 * The middle name of the account owner.
	 */
	private String ownerMiddleName;
	
	/**
	 * The last name of the account owner.
	 */
	private String ownerLastName;
	

	/**
	 * Create a new account with the given names of the account owner and the given amount.
	 * 
	 * @param fn
	 * @param mn
	 * @param ln
	 * @param amt
	 */
	public Account(String fn, String mn, String ln, double amt)
	{
		this.ownerFirstName = fn;
		this.ownerMiddleName = ln;
		this.ownerLastName = ln;
		bal = amt;
	}
	
	/**
	 * @return The current account balance
	 */
	public double checkBalance()
	{
		return bal;
	}

	/**
	 * @return The owner's first name
	 */
	public String getOwnerFirstName()
	{
		return ownerFirstName;
	}

	/**
	 * @return The owner's middle name
	 */
	public String getOwnerMiddleName()
	{
		return ownerMiddleName;
	}

	/**
	 * @return The owner's last name
	 */
	public String getOwnerLastName()
	{
		return ownerLastName;
	}
	
	/**
	 * Withdraw the given amount from this account. If the current account balance is
	 * lower than the requested amount to be withdrawn, throw InsufficientFundsException.
	 * 
	 * @param amt
	 * @throws InsufficientFundsException
	 */
	public void withdraw(double amt) throws InsufficientFundsException
	{
		if (checkSufficientFunds(amt))
			bal -= amt;
		else
			throw new InsufficientFundsException("Insufficient funds.");
	}
 
	public boolean checkSufficientFunds(double amt)
	{
		if (bal >= amt)
			return true;
		else
			return false;
	}
	
	public void deposit(double amt)
	{
		bal += bal + amt;
	}
	
	/**
	 * Transfer the amount "amt" from the given account "acc" into this account.
	 * 
	 * @param amt The amount to be transfered into this account.
	 * @param acc The account from which the money will be transfered.
	 * @throws InsufficientFundsException
	 */
	public void transfer(double amt, Account acc) throws InsufficientFundsException
	{
		if (acc.checkSufficientFunds(amt))
		{
			acc.withdraw(amt);
			deposit(amt);
		}
		else
			throw new InsufficientFundsException("There are not sufficient funds in the account from which you want to transfer."); 
	}
  

  
}
