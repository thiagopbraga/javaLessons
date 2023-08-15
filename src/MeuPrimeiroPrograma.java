public class MeuPrimeiroPrograma {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "somar" -> sum(x, y);
            case "subtrair" -> minus(x, y);
            case "dividir" -> divide(x, y);
            case "multiplicar" -> multiple(x, y);
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    static void divide( int x, int y) {
        System.out.println(x / y);
    }

    static void multiple( int x, int y) {
        System.out.println(x * y);
    }
}
