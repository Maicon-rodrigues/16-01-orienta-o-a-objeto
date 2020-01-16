package CadastrodoPet;

public class App {
    public static void main(String[] args) {

        Responsavel pessoa1 = new Responsavel(

                "maicon",
                "Follmann",
                "04851-030",
                "384",
                17,
                "mai2405rodrigues@gmail.com",
                "976096125"
        );

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.sobrenome);

        Pet animal = new Pet(
                "Drog",
                "Cachorro",
                "Chow Chow",
                6,
                "marrom",
                pessoa1,
                "Vacina"

        );
        System.out.println(animal.especie);
        System.out.println(animal.raca);
    }
}
