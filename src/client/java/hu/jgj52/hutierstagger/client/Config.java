package hu.jgj52.hutierstagger.client;

import me.kitty.radon.api.ButtonRow;
import me.kitty.radon.api.ConfigScreen;
import me.kitty.radon.api.Tab;

import java.util.List;

public class Config extends ConfigScreen {
    @Override
    public String getScreenTitle() {
        return "HuTiersTagger";
    }

    public static ButtonRow gamemode;
    public static ButtonRow enabled;
    public enum gamemodes {
        Vanilla,
        UHC,
        Pot,
        NethPot,
        SMP,
        Sword,
        Axe,
        Mace,
        Cart,
        Creeper,
        DiaSMP,
        OGVanilla,
        ShieldlessUHC
    }

    @Override
    protected void radon() {
        Tab tab = tab("Config");
        gamemode = buttonRow(tab, key("gamemode"), "Gamemode", List.of("A gamemode amit ír a mod"), gamemodes.Vanilla);
        enabled = buttonRow(tab, key("enabled"), "Enabled", List.of(), true);
        HutierstaggerClient.sub();
    }
}
