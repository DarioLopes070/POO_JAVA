package Animais;

public class Gato extends Animal{
    static int numeroDeGatos;

    public Gato(String nome, String cor, double altura, double peso) {
        super(nome, cor, altura, peso);
        numeroDeGatos++;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }
}

