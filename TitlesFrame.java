package Drty;/*
 * Decompiled with CFR 0.139.
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * 
 *@author Meshter Bogdan
 *@version 1.0
 *This class sets the title of the program and  window sizes of the program.
 */
public class TitlesFrame
extends JFrame {
    public TitlesFrame() {
        this.initUI();
    }
/**
 * Creates Graphical User Interface
 * @setTitle sets the title for this frame to the specified string
 * @setDefaultCloseOperation Sets the operation that will happen by default when the user initiates a "close" on this frame.
 * @add changes layout-related information, and therefore, invalidates the component hierarchy
 * @setSize resizescomponent so that it has width width and height height
 */
    private void initUI() {
    	
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(91));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

        /**
         * Causes doRun.run() to be executed asynchronously on the AWT event dispatching thread.
         */
            public void run() {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);

            }
        });
    }

}

