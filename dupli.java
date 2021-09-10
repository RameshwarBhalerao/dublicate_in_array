package google;

import java.util.Arrays;

public class dupli {

	public static void main(String[] args) {

		int a[]= {1,1,2,2,1,2,3,3,1,3,7,9};
		int i=0,j=i+1;
		int count=0;
		int index=0;
		int b[]=new int[0];
		int k=0,l=0;
		while(true)
		{
			if(i<j&&a[i]==a[j])
			{
				count++;
				j=a.length;
			}
			
			if(j<a.length-1)
				j++;
			else
			{
				i++;
				j=i+1;
			}
			if(i==a.length-1)
			{
				j=0;
				if(k==0)
				{
					b=new int[a.length-count];
					count=0;
				}
				if(l<k)
				{
					if(a[k]==a[l])
						count++;
				}
				if(l<k)
					l++;
				else
				{
					if(count==0)
						b[index++]=a[k];
					k++;
					l=0;
					count=0;
				}
				if(k==a.length)
					break;
			}
				
		}
		System.out.println(Arrays.toString(b));
		
		
		
	}

}
