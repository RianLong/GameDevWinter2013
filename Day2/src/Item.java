import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Rian on 12/21/13.
 */
public class Item {
    private TextureRegion texture;

    public Item(TextureRegion texture){
        this.texture = texture;
    }

    public TextureRegion getTexture() {
       return texture;
    }
}
