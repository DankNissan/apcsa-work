public interface StorageInterface<E>
{
    public abstract void open();
    public abstract void close();
    public abstract void store(E thing);
    public abstract String dump();
}
