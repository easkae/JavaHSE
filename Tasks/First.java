// Morozov A.D. = 14 % 12 = 2
package Tasks;

public class First
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println(a < b? a/10 : b/10);
    }
}
