package prototype;

public interface MijlocTransport extends Cloneable {  //face shallow copy

    public MijlocTransport copiaza() throws CloneNotSupportedException;
}
