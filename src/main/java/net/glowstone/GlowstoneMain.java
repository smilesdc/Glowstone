package net.glowstone;

import net.minecraft.workbench.Workbench;
import net.minecraft.workbench.WorkbenchImpl;
import net.minecraft.workbench.server.Server;

/**
 * The main class and backbone of Glowstone, implementing the Workbench.
 */
public class GlowstoneMain extends WorkbenchImpl {

    /**
     * The main method of Glowstone.
     *
     * @param args Command-line parameters.
     */
    public static void main(String[] args) {
        GlowstoneMain main = new GlowstoneMain();
        Workbench.setInstance(main);
        //main.handleParameters(args);
        //main.start();
        System.out.println("Coming soon!");
    }

    @Override
    public String getImplementationName() {
        return "Glowstone";
    }

    @Override
    public String getImplementationVersion() {
        // TODO: fancy this up
        return "0.0.1-SNAPSHOT";
    }

    @Override
    public Server getServer() {
        return null;
    }
}
