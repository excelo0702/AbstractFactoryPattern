package RegionFactory;

import MaterialClasses.*;

public class FranceClothingMaterial implements ClothingMaterialFactory {
    @Override
    public Pattern createPattern() {
        return new FrancePattern();
    }

    @Override
    public Stitching stitching() {
        return new FranceStitching();
    }

    @Override
    public Finishing finishing() {
        return new FranceFinishing();
    }

    @Override
    public QualityChecking checkQuality() {
        return new FranceQualityChecking();
    }

    @Override
    public Tagging addTag() {
        return new FranceTagging();
    }
}