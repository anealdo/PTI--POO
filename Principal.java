package PTI;

public class Principal {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(-2,3);
        Ponto ponto2 = new Ponto(-5, -9);

        System.out.println(ponto1.ehIgual(ponto2));

        System.out.println(ponto1.distanciaDoisPontos(ponto2));
    }
}
