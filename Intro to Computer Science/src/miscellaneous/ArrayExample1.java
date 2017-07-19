package miscellaneous;

public class ArrayExample1
{
	public static void main(String[] args) 
	{
        int n = 123;
 
        // initialize to random values between 0 and 1
        double[] a = new double[n];
        int i = 0; 
        while (i < n) 
        {
          a[i] = Math.random();
          i += 1;
        }
         
        // print array values, one per line
        System.out.println("a[]");
        System.out.println("-------------------");
        i = 0;
        while (i < n) 
        {
          System.out.println(a[i]);
          i += 1;
        }
         
        System.out.println();
        System.out.println("a = " + a);
        System.out.println();
 
        // find the maximum
        double max = Double.NEGATIVE_INFINITY;
        i = 0;
        while (i < n) 
        {
          if (a[i] > max) 
          {
            max = a[i];
          }
          i += 1;
        }
         
        System.out.println("max = " + max);
 
 
        // average
        double sum = 0.0;
        i = 0;
        while (i < n) 
        {
          sum += a[i];
          i += 1;
        }
         
        System.out.println("average = " + sum / n);
 
        // copy to another array
        double[] b = new double[n];
        i = 0;
        while (i < n) 
        {
          b[i] = a[i];
          i += 1;
        }
 
 
        // dot product of a[] and b[]
        double dotProduct = 0.0;
        i = 0;
        while (i < n) 
        {
          dotProduct += a[i] * b[i];
          i += 1;
        }
         
        System.out.println("dot product of a[] and b[] = " + dotProduct);
 
    }
 
}
