import java.util.ArrayList;


public class Box<E> extends Storage<E>
{
    ArrayList<E> list = new ArrayList<E>();
    public void store(E thing) {
        if (list.size() <= 10) {
            list.add(thing);
        }
    }
    public String dump() {
        String out = "You dumped" + list.toString() + "out of your box.";
        list.clear();
        return out;
    }
}
