package ModelElements;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Scene {
    static AtomicInteger nextId = new AtomicInteger();
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;
    public <T>T method1(T flash){
        return flash;
    }
    public <T> T method2(T model, T flash){
        return model;
    }

    public Scene(List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        if(!models.isEmpty()) {
            this.models = models;
        }else{
            throw new Exception("Должна быть одна модель");
        }
        this.flashes = flashes;
        if(!cameras.isEmpty()) {
            this.cameras = cameras;
        }else {
            throw new Exception("Должна быть одна модель");
        }
        this.id = nextId.incrementAndGet();
    }
}
