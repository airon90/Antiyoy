package yio.tro.antiyoy.menu.behaviors.editor;

import yio.tro.antiyoy.menu.ButtonYio;
import yio.tro.antiyoy.menu.behaviors.ReactBehavior;
import yio.tro.antiyoy.menu.scenes.Scenes;

public class RbEditorShowMoneyPanel extends ReactBehavior{

    @Override
    public void reactAction(ButtonYio buttonYio) {
        Scenes.sceneEditorMoneyPanel.create();
    }
}
