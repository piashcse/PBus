package florent37.github.com.rxsharedpreferences.model;

/**
 * Created by Extreme_piash on 6/12/17.
 */

public class RxModel {
    private String tag;
    private Object object;

    public RxModel(String tag, Object object) {
        this.tag = tag;
        this.object = object;
    }

    public RxModel(){

    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
