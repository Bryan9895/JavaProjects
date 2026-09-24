public class Principal {
    public static void main(String[] args) {
        areaCilindro(15, 20);
    }

    static void areaCilindro(int r, int h) {
        double pi = 3.14;

        if (r <= 0) {
            System.out.println("Raio invalido");
            return;
        }

        if (h <= 0) {
            System.out.println("Altura invalida");
            return;
        }

        double area = 2 * pi * r * (r + h);
        System.out.println(area);
    }
}
