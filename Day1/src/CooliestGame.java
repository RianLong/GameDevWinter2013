import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class CooliestGame extends Game {

    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
