import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class GameScreen implements Screen {

    private Stage stage;
    private Table uiTable;

    public GameScreen() {
        stage = new Stage();
        uiTable = new Table();

        Gdx.input.setInputProcessor(stage);

        Skin skin = new Skin(Gdx.files.internal("res/uiskin.json"));
        uiTable.setFillParent(true);
        uiTable.setSkin(skin);

        final Label label = new Label("Hello World", skin);
        uiTable.add(label).align(Align.center);

        uiTable.row();

        Button button = new Button(skin);
        button.add("derp").align(Align.center);
        button.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if(label.textEquals("Hello World")) {
                    label.setText("Nope");
                } else {
                    label.setText("Hello World");
                }

            }

        });
        uiTable.add(button);


        stage.addActor(uiTable);
    }

    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(0.55f, 0.55f, 0.55f, 1f);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();

    }

    @Override
    public void resize(int i, int i2) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
