package Animais;

public class Cachorro extends Animal{
    //Atributos
    static int numeroDeCachorros;
    private double tamanhoDoRabo;



    //Contrutores
//    public Cachorro(){
//    }
    public Cachorro(String nome, String cor, double altura, double peso, double tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, altura, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros++;
    }





    //Metodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
//        if(nome.equals("lily")){
//            this.nome = null;
//        }
        return this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(double tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }


    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
//        if(acao.equals("carinho")){
//            this.estadoDeEspirito = "Feliz";
//        }else if(acao.equals("dar banho")){
//            this.estadoDeEspirito = "Alegre";
//        }else if(acao.equals("vai dormir")){
//            this.estadoDeEspirito = "Bravo";
//        }else{
//            this.estadoDeEspirito = "Neutro";
//        }

        switch (acao){
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "dar banho":
                this.estadoDeEspirito = "Alegre";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "Bravo";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
                break;
        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }
}
