package fiedore.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Commodity> wares;

    public Model() {
        wares = new ArrayList<>();
    }



    public List<Commodity> getWares() {
        return wares;
    }
}
