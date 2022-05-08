package WayneOutlets;

import FactoryProducts.Clothing;
import FactoryProducts.KidsClothing;
import FactoryProducts.MensClothing;
import FactoryProducts.WomensClothing;
import RegionFactory.ClothingMaterialFactory;
import RegionFactory.JapanClothingMaterial;

public class JapanOutlet extends Outlet{
    public ClothingMaterialFactory clothingMaterialFactory = new JapanClothingMaterial();
    @Override
    public Clothing createClothe(String type) {
        Clothing clothe = null;
        if (type=="kids"){
            clothe = new KidsClothing(clothingMaterialFactory);
            clothe.name = "Kid Clothes";
        } else if(type=="Mens"){
            clothe = new MensClothing(clothingMaterialFactory);
            clothe.name = "Men Clothes";
        } else{
            clothe = new WomensClothing(clothingMaterialFactory);
            clothe.name = "Women Clothes";
        }
        return clothe;
    }
}
