// Program which accepts one number and position from user, OFF that bit and return modified number

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
        int iRet = bobj.OffBit(value,pos);
		
		System.out.println(iRet);
		
    }
}

class Bitwise
{
        public int OffBit(int iNo, int iPos)
        {
            int iMask = 0X00000001;
            int iResult = 0;

            iMask = iMask << (iPos-1);

            iResult = iNo & (~iMask);
            
			return iResult;
			
        }
}

