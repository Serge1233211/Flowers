public class Main {
    public static void main(String[] args){
        Bouquet bt=new Bouquet(5);
        Flower rose = new Rose();
        Flower lily = new Lily();
        Flower chrysanthemum = new Chrysanthemum();
        Flower peony = new Peony();
        Flower orchid = new Orchid();

        bt.addFlower(rose);
        bt.addFlower(lily);
        bt.addFlower(chrysanthemum) ;
        bt. addFlower(peony);
        bt.addFlower(orchid);
        Printer.PrintBouquet(bt.getFlowers());
        Printer.printPrice(bt.BouquetCost());
    }
}
