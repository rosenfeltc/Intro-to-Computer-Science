package miscellaneous;

public class Vector {
	public int dimension;
	public double[] vec;
	
	public Vector(int n)
	{
		dimension = n;
		vec = new double[dimension];
		for (int i = 0; i < dimension; i++)
		{
			vec[i] = 0;
		}
	}
	
	public void setIthValue(double value, int index)
	{
		vec[index] = value;
	}
	
	public void setVec(double[] values)
	{
		for(int i = 0; i < values.length; i++)
		{
			setIthValue(values[i], i);
		}
	}
	
	// Question 1
	public static Vector plus(Vector v1, Vector v2)
	{
		if(v1.dimension != v2.dimension)
			{
				System.out.println("Unable to add vectors due to differing dimensions!");
				System.exit(1);
			}
		Vector v3 = new Vector(v1.dimension);
		for (int i = 0; i < v3.dimension; i++)
		{
			v3.setIthValue(v1.vec[i] + v2.vec[i], i);
		}
		
		return v3;
	}
	
	// Question 2
	public Vector plus(Vector v)
	{
		if(dimension != v.dimension)
		{
			System.out.println("Unable to add vectors due to differing dimensions!");
			System.exit(1);
		}
		
		Vector a = new Vector(v.dimension);
		for (int i = 0; i < a.dimension; i++)
		{
			a.setIthValue(vec[i] + v.vec[i], i);
		}
		
		return a;
	}
	
	// Question 3
	public double multiply(Vector v)
	{
		if(dimension != v.dimension)
		{
			System.out.println("Unable to add vectors due to differing dimensions!");
			System.exit(1);
		}
		
		double result = 0;
		
		for(int i = 0; i < dimension; i++)
		{
			result += (vec[i] * v.vec[i]);
		}
		
		return result;
				
	}
	
	public void scale(double scale) 
	{
		  for (int i = 0; i < dimension; i++)
		  {
			  vec[i] = vec[i] * scale;
		  }
	}
}
