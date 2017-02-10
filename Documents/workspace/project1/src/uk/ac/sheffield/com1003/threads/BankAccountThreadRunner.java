/*
 * BankAccountThreadRunner.java  	1.1 21/12/2015
 *
 */

/** 
* BankAccountThreadRunner.java
* 
* 
*   This program runs threads that deposit and withdraw
*   money from the same bank account.
*   
*   Example code written by Cay Horstmann and freely available from
*   http://www.horstmann.com/bigjava3.html
*   
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.threads;

public class BankAccountThreadRunner
{
   public static void main(String[] args)
   {
      BankAccount account = new BankAccount();
      final double AMOUNT = 100;
      final int REPETITIONS = 20;
      final int THREADS = 1;

      for (int i = 1; i <= THREADS; i++)
      {
         DepositRunnable d = new DepositRunnable(
            account, AMOUNT, REPETITIONS);
         WithdrawRunnable w = new WithdrawRunnable(
            account, AMOUNT, REPETITIONS);
         
         Thread dt = new Thread(d);
         Thread wt = new Thread(w);
         
         dt.start();
         wt.start();
      }
   }
}

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
class BankAccount
{
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {
      balance = 0;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      System.out.print("Depositing " + amount + " ");
      double newBalance = balance + amount;
      System.out.println(", new balance is " + newBalance);
      balance = newBalance;
   }
   
   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      System.out.print("Withdrawing " + amount + " ");
      double newBalance = balance - amount;
      System.out.println(", new balance is " + newBalance);
      balance = newBalance;
   }
   
   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
   
   private double balance;
}

/**
   A deposit runnable makes periodic deposits to a bank account.
*/
class DepositRunnable implements Runnable
{
   /**
      Constructs a deposit runnable.
      @param anAccount the account into which to deposit money
      @param anAmount the amount to deposit in each repetition
      @param aCount the number of repetitions
   */
   public DepositRunnable(BankAccount anAccount, double anAmount,
         int aCount)
   {
      account = anAccount;
      amount = anAmount;
      count = aCount;
   }

   public void run()
   {
      try
      {
         for (int i = 1; i <= count; i++)
         {
            account.deposit(amount);
            Thread.sleep(DELAY);
         }
      }
      catch (InterruptedException exception) {}
   }

   private static final int DELAY = 1; 
   private BankAccount account;
   private double amount;
   private int count;
}

/**
   A withdraw runnable makes periodic withdrawals from a bank account.
*/
class WithdrawRunnable implements Runnable
{
   /**
      Constructs a withdraw runnable.
      @param anAccount the account from which to withdraw money
      @param anAmount the amount to deposit in each repetition
      @param aCount the number of repetitions
   */
   public WithdrawRunnable(BankAccount anAccount, double anAmount,
         int aCount)
   {
      account = anAccount;
      amount = anAmount;
      count = aCount;
   }

   public void run()
   {
      try
      {
         for (int i = 1; i <= count; i++)
         {
            account.withdraw(amount);
            Thread.sleep(DELAY);
         }
      }
      catch (InterruptedException exception) {}
   }

   private static final int DELAY = 1; 
   private BankAccount account;
   private double amount;
   private int count;
}
