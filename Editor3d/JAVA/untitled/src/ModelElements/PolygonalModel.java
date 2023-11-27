package ModelElements;
import Stuff.Polygon;
import Stuff.Texture;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Polygon> polygons;
    public List<Texture> textures;

    public PolygonalModel(List<Texture> textures) {
        this.textures = textures;
        this.polygons = new ArrayList<>();
        this.polygons.add(new Polygon());
    }
}
