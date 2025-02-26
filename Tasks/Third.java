// Morozov A.D. = 30 % 12 = 6
package Tasks;

import java.util.ArrayList;
import java.util.Random;

public class Third
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int N = Integer.parseInt(args[0]);
        int[] values_array = new int[N];
        int[] max_values_array = new int[N];
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++)
        {
            int temp_value = random.nextInt(10);
            if (max_value < temp_value)
            {
                max_value = temp_value;
            }
            values_array[i] = temp_value;
            System.out.print(temp_value+" ");
        }

        System.out.println('\n');

        for (int i = 0; i < N; i++)
        {
            max_values_array[i] = max_value;
            System.out.print(max_value+" ");
        }

        System.out.println();
    }
}
