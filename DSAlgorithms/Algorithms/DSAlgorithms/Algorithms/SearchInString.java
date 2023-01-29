/*Search for a character in a string */
package Algorithms;

public class SearchInString 
{
    public static void main(String[] args) {
        String name = "arunika";
        char target ='d';
        boolean result = searchinstring(name, target);
        System.out.println(result);

        
    }

    static boolean searchinstring(String str , char target)
    {
        if(str.length() == 0)
        return false;

    for(int i = 0 ; i<str.length();i++)
    {
        if(str.charAt(i) == target)
        return true;

    }

    return false;
    
}
}
