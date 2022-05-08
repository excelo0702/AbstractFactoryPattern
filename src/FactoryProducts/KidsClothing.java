package FactoryProducts;

import RegionFactory.ClothingMaterialFactory;

public class KidsClothing extends Clothing {
    public ClothingMaterialFactory clothingMaterialFactory;

    public KidsClothing(ClothingMaterialFactory clothingMaterialFactory){
        this.clothingMaterialFactory = clothingMaterialFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        System.out.println("Instructions for Kids Cold Clothing: XYZ");
        pattern = clothingMaterialFactory.createPattern();
        stitching = clothingMaterialFactory.stitching();
        finishing = clothingMaterialFactory.finishing();
        qualityChecking = clothingMaterialFactory.checkQuality();
        tagging = clothingMaterialFactory.addTag();
    }
}
