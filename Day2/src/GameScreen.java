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
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import java.util.ArrayList;

public class GameScreen implements Screen {

    private Stage stage;
    private Table uiTable;

    public GameScreen() {
        stage = new Stage();
        uiTable = new Table();
        ArrayList<Item> items = ItemLoader.loadItems("res/items.png");

        Gdx.input.setInputProcessor(stage);

        Skin skin = new Skin(Gdx.files.internal("res/uiskin.json"));
        uiTable.setFillParent(true);
        uiTable.setSkin(skin);

        Window inventoryWindow = new Window("Inventory",skin);

        for (int i = 0; i < items.size(); i++) {
            inventoryWindow.add(new Image(items.get(i).getTexture()));

            if ((i + 1) % 4 == 0 && i != 0){
                inventoryWindow.row();
            }

        }

        uiTable.add(inventoryWindow).align(Align.center);
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
