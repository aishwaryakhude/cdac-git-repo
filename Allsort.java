
public class Allsort {

	public void selection_sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int temp=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<temp)
				{
					int t=arr[j];
					arr[j]=temp;
					temp=t;
					
				}
				arr[i]=temp;
			}
			
		}
	}
	public void insertion_sort(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0)
			{
				if(arr[i]<arr[j])
				{
					arr[j+1]=arr[j];
				}
				else
					break;
				j--;
			}
			arr[j+1]=temp;
				
			}
			
		}
		
	
public void bubble_sort(int arr[])
{
	for(int i=0; i<arr.length-1; i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j+1]<arr[j])
			{
				int t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
		}
			
	}
		
}
public void quick(int arr[])
{
	
}
	
}



