// Program to check whether 9th and 12th bit is ON or OFF

import java.lang.*;
import java.util.*;

class Assignment30_3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int value=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		boolean bret=bobj.CheckBit(value);
		
		if(bret==true)
		{
			System.out.println("Atleast one of the Bit is on");
		}
		else
		{
			System.out.println("Both Bits are off");
		}
	}
}

class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		
		int iMask=0X00000900;
		int iResult=0;
		
		iResult=iNo & iMask;
		
		if(iResult==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}