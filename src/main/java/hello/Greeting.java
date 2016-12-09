package hello;

/**
 * Created by Charley on 12/6/2016.
 */
public class Greeting {
    private final long id;
    private final String content;
    private final String metadata;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
        this.metadata = "this is some extra content";
    }
    public long getId(){
        return id;
    }
    public String getContent(){
        return content;
    }
    public String getMetadata() {
        return metadata;
    }
}
