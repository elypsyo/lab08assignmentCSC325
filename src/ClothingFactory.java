public interface ClothingFactory {

    //Make an interface that can be added to with ease. Then allow each style to be selected as well.
    ClothingItem selectClothing();
    ClothingType selectFormality();

}
