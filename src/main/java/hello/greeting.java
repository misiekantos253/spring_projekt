package hello;

/**
 * Created by misiekantos253 on 2017-04-15.
 */
public class greeting {

    private final long id;
    private final String content;

    public greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
