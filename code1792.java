import java.util.ArrayList;
import java.util.Collections;

public class code1792 {
    public static void main(String[] args) {
        int classes[][] = {{1,2},{3,5},{2,2}};
        int extraStudents = 2;
        int len = classes.length;
        // float value[]=new float[len];
        ArrayList<Double>value=new ArrayList<>();
        System.out.println(classes.length);
        int k=0;
        for(int i=0;i<len;i++)
        {
            boolean flag=false;
            Float tot = (float) 0 ;
            for(int j=0;j<classes.length;j++)
            {
                
                if(i==j)
                {
                       
                        tot=(float) (tot+ ((((classes[j][0])+extraStudents)*1.0)/(classes[j][1]+extraStudents)));
                       
                }
                else
                {
                   
                      tot=(float) ((float) tot+(((classes[j][0]))*1.0)/(classes[j][1]));
                     
                }
            }
            value.add((double) (tot/3));
        }
        System.out.println(Collections.max(value));



    }
}