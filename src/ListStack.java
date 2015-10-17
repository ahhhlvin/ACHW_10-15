import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by alvin2 on 10/11/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class ListStack<T> extends ArrayList<T>
{

    public void push (T t) {
        this.add(t);
    }

    public T pop() {
        if (!this.isEmpty())
        {
            return this.remove((this.size() - 1));
        } else {
            throw new StackOverflowError();
        }
    }

    public T top() {
        if (!this.isEmpty())
        {
            return this.get(this.size() - 1);
        } else {
            throw new StackOverflowError();
        }

    }





}
