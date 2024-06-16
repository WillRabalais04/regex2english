import java.io.IOException;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.UnixTerminal;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;
import com.googlecode.lanterna.gui2.*;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
public class lanternaTest{

       public static void main(String[] args) throws IOException{

    //    try {
    //         Terminal terminal = new UnixTerminal();
    //     } catch (IOException e) {
    //         System.out.println("Case 2!");
    //         Terminal terminal = new SwingTerminal();
    //     }

    // Terminal terminal = new DefaultTerminalFactory().createTerminal();
    // terminal.setCursorPosition(10, 5);
    // terminal.putCharacter('H');
    // terminal.putCharacter('e');
    // terminal.putCharacter('l');
    // terminal.putCharacter('l');
    // terminal.putCharacter('o');
    // terminal.putCharacter('!');
    // terminal.setCursorPosition(0, 0);



    // Setup terminal and screen layers
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        // Create panel to hold components
        Panel panel = new Panel();
        panel.setLayoutManager(new GridLayout(2));

        panel.addComponent(new Label("Forename"));
        panel.addComponent(new TextBox());

        panel.addComponent(new Label("Surname"));
        panel.addComponent(new TextBox());

        panel.addComponent(new EmptySpace(new TerminalSize(0,0))); // Empty space underneath labels
        panel.addComponent(new Button("Submit"));

        // Create window to hold the panel
        BasicWindow window = new BasicWindow();
        window.setComponent(panel);

        // Create gui and start gui
        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
        gui.addWindowAndWait(window);

    }
}