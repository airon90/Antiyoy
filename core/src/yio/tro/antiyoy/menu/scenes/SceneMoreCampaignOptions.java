package yio.tro.antiyoy.menu.scenes;

import yio.tro.antiyoy.GraphicsYio;
import yio.tro.antiyoy.menu.ButtonYio;
import yio.tro.antiyoy.menu.CheckButtonYio;
import yio.tro.antiyoy.menu.MenuControllerYio;
import yio.tro.antiyoy.menu.behaviors.ReactBehavior;

public class SceneMoreCampaignOptions extends AbstractScene{

    public SceneMoreCampaignOptions(MenuControllerYio menuControllerYio) {
        super(menuControllerYio);
    }


    @Override
    public void create() {
        menuControllerYio.beginMenuCreation();

        menuControllerYio.getYioGdxGame().beginBackgroundChange(2, true, true);

        menuControllerYio.spawnBackButton(551, ReactBehavior.rbExitToCampaign);

        menuControllerYio.getSliders().get(6).appear();
        menuControllerYio.getSliders().get(6).setPos(0.15, 0.73, 0.7, 0);

        ButtonYio shadow = buttonFactory.getButton(generateRectangle(0.05, 0.45, 0.9, 0.42), 553, null);
        shadow.onlyShadow = true;
        shadow.setAnimType(ButtonYio.ANIM_UP);
        shadow.setTouchable(false);

        ButtonYio firstColorLabel = buttonFactory.getButton(generateRectangle(0.05, 0.67, 0.9, 0.2), 550, null);
        menuControllerYio.renderTextAndSomeEmptyLines(firstColorLabel, getString("player_color"), 2);
        firstColorLabel.setTouchable(false);
        firstColorLabel.setAnimType(ButtonYio.ANIM_UP);
        firstColorLabel.setShadow(false);

        ButtonYio chkBase = buttonFactory.getButton(generateRectangle(0.05, 0.45, 0.9, 0.25), 552, null);
        if (chkBase.notRendered()) {
            chkBase.cleatText();
            chkBase.addTextLine(" ");
            chkBase.addTextLine(" ");
            chkBase.addTextLine(" ");
            chkBase.addTextLine(getString("slay_rules"));
            chkBase.addTextLine(" ");
            menuControllerYio.getButtonRenderer().renderButton(chkBase);
        }
        chkBase.setTouchable(false);
        chkBase.setAnimType(ButtonYio.ANIM_UP);
        chkBase.setShadow(false);

        double checkButtonSize = 0.05;
        double hSize = GraphicsYio.convertToHeight(checkButtonSize);
        double chkX = 0.88 - checkButtonSize;
        double chkY = 0.53;

        CheckButtonYio chkSlayRules = CheckButtonYio.getCheckButton(menuControllerYio, generateSquare(chkX, chkY - hSize / 2, hSize), 17);
        chkSlayRules.setTouchPosition(generateRectangle(0.05, chkY - hSize * 1.5, 0.9, hSize * 3));
        chkSlayRules.setAnimType(ButtonYio.ANIM_UP);

        menuControllerYio.endMenuCreation();
    }
}
