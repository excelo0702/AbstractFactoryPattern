package FactoryProducts;

import MaterialClasses.*;

public abstract class Clothing {
    public String name;
    public Pattern pattern;
    public Stitching stitching;
    public Finishing finishing;
    public QualityChecking qualityChecking;
    public Tagging tagging;

    abstract void prepare();

    public void pack(){
        System.out.println("Place the clothe into the box");
    }
}
