import RegionFactory.ClothingMaterialFactory;
import RegionFactory.FranceClothingMaterial;
import WayneOutlets.FranceOutlet;
import WayneOutlets.JapanOutlet;
import WayneOutlets.Outlet;

public class WayneIndustry {
    public static void main(String[] args){
        Outlet franceOutlet = new FranceOutlet();
        Outlet japanOutlet = new JapanOutlet();

        System.out.println("Order Kid Clothes");
        franceOutlet.orderClothe("kids");

        System.out.println("Order Men Clothes");
        franceOutlet.orderClothe("Mens");

    }
}
