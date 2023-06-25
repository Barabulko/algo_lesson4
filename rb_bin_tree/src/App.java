public class App {
    public static void main(String[] args) throws Exception {
        BinTree<Integer> tree = new BinTree<>();
        tree.add(5);
        tree.add(2);
        tree.add(7);
        tree.add(1);
        tree.add(4);
        tree.add(3);

        tree.print();
    }
}
