public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(3);
        magicBox.add("Anya");
        magicBox.add("Pasha");
        magicBox.add("Roma");
        magicBox.add("Natalya");
        System.out.println(magicBox.pick());

        MagicBox<Integer> magicBox1 = new MagicBox<>(7);
        magicBox1.add(5);
        magicBox1.add(50);
        magicBox1.add(35);
        System.out.println(magicBox1.pick());

    }
}