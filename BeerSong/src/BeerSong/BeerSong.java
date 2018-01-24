
package BeerSong;

public class BeerSong
{
    public static void Ninety_Nine_Bottles_of_Beer(int n)
    {
        if (n == 1)
        {
            System.out.printf("%d bottle of beer on the wall, %d "
                    + "bottle of beer\ntake one down, pass it around, no more bottles of "
                    + "beer on the wall\n", n, n);
        }
        else if (n == 2)
        {
            System.out.printf("%d bottles of beer on the wall, %d "
                    + "bottles of beer\ntake one down, pass it around, %d bottle of "
                    + "beer on the wall\n", n, n, n-1);
        }
        else
        {
            System.out.printf("%d bottles of beer on the wall, %d "
                    + "bottles of beer\ntake one down, pass it around, %d bottles of "
                    + "beer on the wall\n", n, n, n-1);
        }
        
        if (n != 1)
        {
            Ninety_Nine_Bottles_of_Beer(n-1);
        }
    }
    
    public static void main(String[] args) 
    {
        
    }
}
