package WayneOutlets;

import FactoryProducts.Clothing;

public abstract class Outlet {
    public abstract Clothing createClothe(String type);

    public void orderClothe(String type){
        Clothing clothe = createClothe(type);
        System.out.println("Creating a "+clothe.name);
        clothe.pack();
    }
}
