package FactoryProducts;

import RegionFactory.ClothingMaterialFactory;

public class MensClothing extends Clothing {
    public ClothingMaterialFactory clothingMaterialFactory;

    public MensClothing(ClothingMaterialFactory clothingMaterialFactory){
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
