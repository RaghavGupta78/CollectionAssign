import java.util.*;
public class listsum {
    public static void main(String[] args) {
        List<Float> l1 = new ArrayList<Float>();
        l1.add((float) 23.56);
        l1.add((float) 12.11);
        l1.add((float) 45.06);
        l1.add((float) 89.21);
        l1.add((float) 66.36);

       Iterator<Float> it = l1.iterator();
       float sum =0;
       while (it.hasNext()){
           float num = it.next();
           sum = sum + num;

       }
        System.out.println(sum);

    }
}
