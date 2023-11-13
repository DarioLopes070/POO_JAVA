import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {
//        Cachorro cachorro1 = new Cachorro();
//        Cachorro cachorro1;
//        cachorro1 = new Cachorro();
//        cachorro1.setNome("tótó");
//        cachorro1.setCor("Caramelo");
//        cachorro1.setAltura(1.20);
//        cachorro1.setPeso(15);
//        cachorro1.setTamanhoDoRabo(0.2);
//        System.out.println(cachorro1.getNome());
//        System.out.println(cachorro1.getCor());
//        System.out.println(cachorro1.getPeso());
//        System.out.println(cachorro1.getAltura());
//        System.out.println(cachorro1.getTamanhoDoRabo());
//        cachorro1.latir();
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
//        String interacao = cachorro1.interagir("dar banho");
//        System.out.println("O cachorro está " + interacao);


        Cachorro cachorro1 = new Cachorro("Rex", "Preto", 1.2, 10, 0.20, "nada");
//        System.out.println(cachorro2.getNumeroDeCachorros());
//        Cachorro cachorro3 = new Cachorro("Spike", "Preto", 1.2, 10, 0.20, "nada");
//        System.out.println(cachorro2.getNumeroDeCachorros());
//        System.out.println(cachorro3.getNumeroDeCachorros());

//        System.out.println(cachorro2.getNome());
//        System.out.println(cachorro2.getCor());

//        System.out.println(cachorro2.toString());
//        System.out.println(cachorro3.toString());

        Gato gato1 = new Gato("Felix", "Cinza", 0.8, 5);
        Passaro passaro1 = new Passaro("Rex", "Azul", 1.2, 4);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();











        //System.out.println("Hello world!");
        //byte -128 até 127
        //byte variavelByte = 120;
        //System.out.println(variavelByte);
        //short -32768 até 32767
        //short variavelShort = 30000;
        //char 0 até 65535
        //char variavelChar = 60000;
        // long
        //float
        //double

    }
}