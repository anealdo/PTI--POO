
package PTI;
public class Ponto {
    private int x;
    private int y;

    //Construtor sem parâmetros
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }
    //Construtor com parâmetros
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    //Método que retorna true se X e Y de dois pontos são iguais.
    public boolean ehIgual(Ponto ponto2){
        return x == ponto2.getX() &&
                y == ponto2.getY();
    }
    //Método que calcula a distância entre dois pontos.
    public double distanciaDoisPontos(Ponto ponto2){
        double resultado = Math.sqrt(Math.pow(ponto2.getX() - x, 2) + Math.pow(ponto2.getY() - y,2));
        return resultado;
    }

}

//Método que calcula a distância entre dois pontos.
//public double distanciaDoisPontos(double xb, double yb){
//    double resultado = Math.sqrt(Math.pow(xb - x, 2) + Math.pow(yb - y,2));
//    return resultado;
//}