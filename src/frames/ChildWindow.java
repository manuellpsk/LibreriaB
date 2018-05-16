/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Notebook
 */
public class ChildWindow extends JFrame {
    private MenudeOperaciones mainWindow;
    private String windowName;

    public ChildWindow(MenudeOperaciones mainWindow, String windowName) {

        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        this.mainWindow = mainWindow;
        this.windowName = windowName;

        this.addWindowListener(new WindowAdapter() {

            public void windowClosed(WindowEvent e) {

                // Cuando la ventana se cierra, notifica a mainWindow
                mainWindow.childClosed(windowName, e);
            }
            
        });
    }
}
