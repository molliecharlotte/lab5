package lab5;

public class BubbleSort<T extends Comparable<? super T>> implements ISorting<T>
{

	public T[] sort(T[] elements) 
	{
		int size = elements.length;
		T temp;
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 1; j < size - 1; j++)
			{
				if(elements[i].compareTo(elements[j]) > 0)
				{
					temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		
		return elements;
	}

	public T[] descendingSort(T[] elements) 
	{
		int size = elements.length;
		T temp;
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 1; j < size - 1; j++)
			{
				if(elements[i].compareTo(elements[j]) > 0)
				{
					temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		
		return elements;
	}
	
	
	public int compareTo(T o)
	{
	
		
		
		return 0;
	}
	
}
