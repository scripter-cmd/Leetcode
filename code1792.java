import java.util.ArrayList;
import java.util.Collections;

public class code1792 {
    public static void main(String[] args) {
        // int classes[][] = {{1,2},{3,5},{2,2}};
        // int extraStudents = 2;

        int classes[][] = {{2,4},{3,9},{4,5},{2,10}};
        int extraStudents = 4;


        double ans=0;
        System.out.println(1/2);
        for(int i=0;i<classes.length;i++)
        {
            Double fl;
            Double max=(double) 0;
            for(int j=0;j<extraStudents;j++)
            {
                 System.out.println("ff"+(classes[i][0]+j)+" "+(classes[i][1]+j));
                 fl= ((double)(classes[i][0]+j)/((double)classes[i][1]+j));
                 max=Math.max(max, fl);
                 
                 System.out.println("--"+fl);
            }
            System.out.println("MAX"+max);
            ans+=max;
        }
        System.out.println((double) ans/3);
        System.out.printf("%.5f\n", ans/3);


    }
}