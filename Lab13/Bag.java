import java.util.ArrayList;


public class Bag<E> extends Storage<E>
{
    ArrayList<E> list = new ArrayList<E>();
    public void store(E thing) {
        if (list.size() <= 5) {
            list.add(thing);
        }
    }
    public String dump() {
        String out = "You dumped" + list.toString() + "out of your bag.";
        list.clear();
        return out;
    }
}
