// Program which accepts one number and position from user and check whether bit at position is ON or OFF

import java.lang.*;
import java.util.*;

class Assignment32_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        System.out.println("Enter position ");
        int pos = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bRet = bobj.ChkeBit(value,pos);
		
		if(bRet==false)
		{
			System.out.println("FALSE");
		}
		else
		{
			System.out.println("TRUE");
		}
    }
}

class Bitwise
{
        public boolean ChkeBit(int iNo, int iPos)
        {
            int iMask = 0X00000001;
            int iResult = 0;

            iMask = iMask << (iPos-1);

            iResult = iNo & iMask;
            
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

