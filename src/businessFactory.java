public class businessFactory implements ClothingFactory{

    //A type of factory focusing on the business style of clothing which implements the greater clothing factory interface

    @Override
    public ClothingItem selectClothing() {
        return new tops();
    }

    @Override
    public ClothingType selectFormality() {
        return new professional();
    }
}
