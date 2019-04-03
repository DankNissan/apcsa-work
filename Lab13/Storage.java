public abstract class Storage<E> implements StorageInterface<E>
{
    public void open() {
        System.out.println("Opened");
    }
    public void close() {
        System.out.println("Closed");
    }
}
