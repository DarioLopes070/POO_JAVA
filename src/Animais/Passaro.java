package Animais;

public class Passaro extends Animal{
    static int numeroDePassaros;

    public Passaro(String nome, String cor, double altura, double peso) {
        super(nome, cor, altura, peso);
        numeroDePassaros++;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }
}
