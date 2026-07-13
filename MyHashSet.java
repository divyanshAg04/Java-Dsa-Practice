public class MyHashSet {

    private boolean[] storage;

    public MyHashSet() {
        storage = new boolean[1_000_001];
    }

    public void add(int key) {
        storage[key] = true;
    }

    public void remove(int key) {
        storage[key] = false;
    }

    public boolean contains(int key) {
        return storage[key];
    }

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();

        hashSet.add(1);
        hashSet.add(2);

        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(3));

        hashSet.add(2);
        System.out.println(hashSet.contains(2));

        hashSet.remove(2);
        System.out.println(hashSet.contains(2));
    }
}