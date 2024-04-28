public class PhraseOMatic {
    public static void main(String[] args) throws Exception {
        String[] wordListOne = {
            "cachorro",
            "gato",
            "banana",
            "carro",
            "computador",
            "livro",
            "mesa",
            "telefone",
            "caneta",
            "janela"
        };

        String[] wordListTwo = {
            "elefante",
            "avião",
            "abacaxi",
            "moto",
            "televisão",
            "cadeira",
            "lápis",
            "porta",
            "óculos",
            "copo"
        };

        String[] wordListThree = {
            "macaco",
            "bicicleta",
            "morango",
            "barco",
            "geladeira",
            "sofá",
            "laptop",
            "chave",
            "relógio",
            "garrafa"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + " e " + wordListThree[rand3] + ".";
        System.out.println("Precisamos de " + phrase);

        // final int numero = 11;
        // System.out.println((int) Math.random() * numero);
        // System.out.println((int) (Math.random() * numero));
        // System.out.println(Math.random() * numero);
        // System.out.println(Math.random() * numero);
    }
}
