package collection_framework.collectionAndLists;

public class VectorClass {
    public static void main(String[] args) {
        //Java Vector:
        /*
        The Vector class synchronizes each individual operation. This means whenever we want to perform some operation
        on vectors, the Vector class automatically applies a lock to that operation.
        It is because when one thread is accessing a vector, and at the same time another thread tries to access it, an
        exception called ConcurrentModificationException is generated.
        Due to continuous use of locks for each operation, vectors are slightly less efficient. That is why, in single
        threaded environments, we prefer to use ArrayList, over Vector.

        Vectors are used in multithreaded environments.
         */
    }
}
