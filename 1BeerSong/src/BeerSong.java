public class BeerSong {
    public static void main(String[] args) throws Exception {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){
            if (beerNum == 1) {
                word = "Bottle";//no singular, pois é a ultima garrafa
            }

            System.out.println(beerNum + " " + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around");

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            }else {
                System.out.println("No more bottles of beer on the wall");
            }

            beerNum--;
        }
    }
}
