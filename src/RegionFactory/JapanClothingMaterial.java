package RegionFactory;

import MaterialClasses.*;

public class JapanClothingMaterial implements ClothingMaterialFactory{
    @Override
    public Pattern createPattern() {
        return new KimonoPattern();
    }

    @Override
    public Stitching stitching() {
        return new JapanStitching();
    }

    @Override
    public Finishing finishing() {
        return new JapanFinishing();
    }

    @Override
    public QualityChecking checkQuality() {
        return new JapanQualityChecking();
    }

    @Override
    public Tagging addTag() {
        return new JapanTagging();
    }
}
