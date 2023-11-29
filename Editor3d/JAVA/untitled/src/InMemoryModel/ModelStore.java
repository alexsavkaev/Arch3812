package InMemoryModel;
import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PolygonalModel> models;
    public  List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<>();
        List<Texture> textures = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.models.add(new PolygonalModel(textures));
        this.flashes.add(new Flash());
        this.cameras.add(new Camera());
        this.scenes.add(new Scene(models,flashes,cameras));
    }
    public Scene getScene(int id){
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}

























