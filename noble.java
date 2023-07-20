package sample;

import java.util.Arrays;
import java.util.Scanner;

public class noble {
	public class Noble {
		public static int  noblesnumber(int arr[]) {
			Arrays.sort(arr);
			int countSe=0,countNe=0;
			if(arr[0]==0)
			{
				countNe++;
			}
			for(int i=1;i<arr.length;i++) 
			{
				if(arr[i]!=arr[i-1])
				{
					countSe=i;
				}
				if(countSe==arr[i]) 
				{
					countNe++;
				}
			}
			return countNe++;
		}
			

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
			}
			int value=noblesnumber(ar);
			System.out.println(value);

		}

	}

}
