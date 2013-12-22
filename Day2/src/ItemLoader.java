import java.util.ArrayList;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ItemLoader {
    static ArrayList<Item> loadItems(String fileName) {
        ArrayList<Item> items = new ArrayList<Item>();
        Texture itemSheet = new Texture(fileName);
        TextureRegion[][] itemTextures = TextureRegion.split(itemSheet,24,24);

        for (int col = 0; col < itemTextures.length; col++) {
            for (int row = 0; row < itemTextures[col].length; row++){
                items.add(new Item(itemTextures[col][row]));
            }
        }

        return items;
    }
}
