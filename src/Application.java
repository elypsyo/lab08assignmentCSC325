public class Application {

    //A small sample of code which allows us to select each public interface we used to make the design pattern abstract

    private ClothingItem CI;
    private ClothingType CT;

    public Application(ClothingFactory factory){
        CI = factory.selectClothing();
        CT = factory.selectFormality();
    }

    public void revealContent(){
        CI.typeOfPiece();
        CT.typeOfClothing();
    }
}
