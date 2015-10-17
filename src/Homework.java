import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by alvin2 on 10/15/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Homework
{


    public static void main(String[] args)
    {

        int[] numbers = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(isTrue(numbers));







        
        ArrayList<String> brackets = new ArrayList<String>();
        //        brackets.add("(");
        //
        //        brackets.add("(");
        //        brackets.add("(");

        brackets.add("(");
        brackets.add("[");
        brackets.add("{");
        brackets.add("}");
        brackets.add("]");
        brackets.add(")");

//        brackets.add(")");
//        brackets.add(")");
//        brackets.add(")");
//        brackets.add(")");


        System.out.println(bracketTrue(brackets));

    }


    public static boolean isTrue(int[] array)
    {

        int arraySize = array.length - 1;
        int count = 0;

        for(int i = 0; i < arraySize; i++)
        {
            // insert if statement to identify which number appears the most in the array

            int temp = array[i];
            int tempCount = 0;

            for(int anArray : array)
            {
                if(anArray == temp)
                {
                    tempCount++;
                }

                if(tempCount > temp)
                {
                    count = tempCount;
                }
            }

        }

        return count > arraySize / 2;
    }


    public static boolean bracketTrue(ArrayList<String> brackets)
    {

        Stack<String> stack = new Stack<String>();

        for(String bracket : brackets)
        {
            if(bracket.equals("["))
            {
                stack.push(bracket);
            }
            else if(bracket.equals("{"))
            {
                stack.push(bracket);

            }
            else if(bracket.equals("("))
            {
                stack.push(bracket);

            }

            if (!stack.isEmpty())
            {
                if(bracket.equals("]") && stack.peek().equals("["))
                {
                    stack.pop();
                }
                else if(bracket.equals("}") && stack.peek().equals("{"))
                {
                    stack.pop();

                }
                else if(bracket.equals(")") && stack.peek().equals("("))
                {
                    stack.pop();
                }
            } else {
                return false;
            }

        }

        return stack.isEmpty();

    }


}
