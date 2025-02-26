// Morozov A.D. = 15 % 12 = 3
package Tasks;

public class Second
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double min = Math.min(a, b);

        System.out.println(min);
        System.out.println(Math.pow(min, 8));
    }
}
