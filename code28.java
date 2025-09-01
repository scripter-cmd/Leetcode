import java.util.ArrayList;
import java.util.Arrays;

public class code28 {

    public static void main(String[] args) {
        // String haystack = "abcdefg";
        // String needle = "cde";
        
        String haystack = "sadbutsad";
        String needle = "sad";

        // String haystack = "leetcode";
        // String needle = "leeto";


        ArrayList<Integer>ar =new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(haystack.contains(needle))
                {
                int last=i;
                for(int j=0;j<needle.length();j++)
                {
                    if(haystack.charAt(i)!=needle.charAt(j))
                    {
                        flag=false;
                        break;
                    }
                    i++;
                }
                
                ar.add(last);
                }
                else
                {
                    ar.add(-1);
                    break;
                }
            }
            
           
            flag=true;
        }

        System.out.println(ar);
        // ArrayList<Integer> ar=new ArrayList<>();

    }
}