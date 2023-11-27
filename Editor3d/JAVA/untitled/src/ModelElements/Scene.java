package ModelElements;

import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Scene {
    static AtomicInteger nextId = new AtomicInteger();
    public int id;
    public PolygonalModel models;
    public List<Flash> flashes;
    public List<Camera> cameras;
    public Type method1(Type type){
        return type;
    }
    public Type method2(Type t1, Type t2){
        return t2;
    }

    public Scene(PolygonalModel models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
        this.id = nextId.incrementAndGet();
    }
}
