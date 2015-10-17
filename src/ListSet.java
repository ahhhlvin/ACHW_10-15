import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * Created by alvin2 on 10/11/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class ListSet<T> extends ArrayList<T> implements Set<T>
{

    @Override
    public boolean add(T t)
    {
        if (!this.contains(t)) {
            this.add(t);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAll(ArrayList<T> c)
    {
        for (T t : c) {
            this.remove(t);
        }
        return true;

    }

    public boolean retainAll(ArrayList<T> c)
    {

        ListSet<T> temp = new ListSet<T>();
        for (T t : c) {
            if (this.contains(t)) {
                temp.add(t);
            }

        }
        this.clear();
        this.addAll(temp);
        return true;
    }
}
