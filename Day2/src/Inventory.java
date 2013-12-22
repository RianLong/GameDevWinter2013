import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class Inventory extends Game {

    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
