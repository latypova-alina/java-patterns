package colony;

import java.io.Serializable;

import static colony.BacteriaFactory.getClassFromFactory;

/**
 * Created by alina on 09.03.17.
 */
public class FlyWeightBacteria implements Serializable {
    private Bacteria bacteria;
    private boolean ready;

    public FlyWeightBacteria(String gender){
        this.bacteria = getClassFromFactory(gender);
        ready = true;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void multiply(){
        //
    }
}
