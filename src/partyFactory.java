public class partyFactory implements ClothingFactory{

    //A type of factory focusing on the party style of clothing which implements the greater clothing factory interface


    @Override
    public ClothingItem selectClothing() {
        return new pants();
    }

    @Override
    public ClothingType selectFormality() {
        return new party();
    }
}
