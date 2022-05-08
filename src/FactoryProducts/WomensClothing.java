package FactoryProducts;

import RegionFactory.ClothingMaterialFactory;

public class WomensClothing extends Clothing {
    public ClothingMaterialFactory clothingMaterialFactory;

    public WomensClothing(ClothingMaterialFactory clothingMaterialFactory){
        this.clothingMaterialFactory = clothingMaterialFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        System.out.println("Instructions for Womens Cold Clothing: XYZ");
        pattern = clothingMaterialFactory.createPattern();
        stitching = clothingMaterialFactory.stitching();
        finishing = clothingMaterialFactory.finishing();
        qualityChecking = clothingMaterialFactory.checkQuality();
        tagging = clothingMaterialFactory.addTag();
    }
}

