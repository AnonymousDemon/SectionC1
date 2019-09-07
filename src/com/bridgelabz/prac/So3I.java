package com.bridgelabz.prac;

public class So3I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,-1,2,-2,-3,3,0,-5,5};
		int n =a.length;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=i+2;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+","+a[j]+","+a[k]+"\n");
					}
				}
			}
		}
		
	}

}
