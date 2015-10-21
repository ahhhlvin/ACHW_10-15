import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alvin2 on 9/24/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Exercises
{
    public static void main(String[] args)
    {
//        int sum = 0;
//
//
//        for(int i = 0; i < 1000; i++)
//        {
//            if(i % 3 == 0 || i % 5 == 0)
//            {
//                sum += i;
//                System.out.println(sum);
//            }
//        }
//

//        ListSet<String> list = new ListSet<String>();
//        list.add("Hello");
//        list.add("Hola");
//        list.add("Ni Hao");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }




//        fibonacciEven();

        int[] nums = {1, 1, 1, 2, 2, 3, 3, 5};
        System.out.println(getCommonInt(nums));

    }


    public static void fibonacciEven()
    {
        int first = 0;
        int second = 1;
        ArrayList<Integer> evenNums;

//        if (first < 4000000 || second < 4000000)
//        {

        evenNums = new ArrayList<Integer>();

            for(int i = 0; i < 10; i++)
            {

                int sum = first + second;
                first = second;
                second = sum;
                System.out.println(second);

                if (second % 2 == 0) {
                    evenNums.add(second);
                }

            }
//        }
    }

    public static HashMap<Integer, Integer> getCommonInt(int[] nums) {

        HashMap<Integer, Integer> orderedNums = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (!orderedNums.containsKey(num)) {
                orderedNums.put(num, 1);
            } else {
                orderedNums.put(num, orderedNums.get(num)+1);
            }
        }

        return orderedNums;

    }


}
