package RegionFactory;

import MaterialClasses.*;

public interface ClothingMaterialFactory {
    public Pattern createPattern();
    public Stitching stitching();
    public Finishing finishing();
    public QualityChecking checkQuality();
    public Tagging addTag();
}
