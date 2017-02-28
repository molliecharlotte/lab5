package lab5;

public class BubbleSort implements ISorting<T>
{

	public BubbleSort()
	{
		
	}

	public T[] sort(T[] elements) 
	{
		int size = elements.size();
		int temp = 0;
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 1; j < size - 1; j++)
			{
				if(elements[i] > elements[j])
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
		int size = elements.size();
		int temp = 0;
		
		for(int i = 0; i < size; i++)
		{
			for(int j = 1; j < size - 1; j++)
			{
				if(elements[i] < elements[j])
				{
					temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		
		return elements;
	}

}
