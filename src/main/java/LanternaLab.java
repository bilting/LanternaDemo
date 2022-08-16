import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.awt.*;
import java.io.IOException;

public class LanternaLab {
    final static TextColor RED = new TextColor.RGB(255,0,0);
    final static TextColor GREEN = new TextColor.RGB(0,255,0);
    static Terminal terminal;
    public static void main(String[] args) throws IOException {
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory();
        terminal = terminalFactory.createTerminal();
        terminal.setCursorVisible(false);
        terminal.setForegroundColor(new TextColor.RGB(255,0,0));
        terminal.setBackgroundColor(new TextColor.RGB(255,255,255));
        for (int row = 1; row <= 24; row++) {
            for (int col = 1; col <= 80; col++) {
                out(row,col,'3', GREEN);
            }
        }
        out(4,4,'X', RED);



    }
    static void out(int row, int col, char c, TextColor color) throws IOException {
        terminal.setForegroundColor(color);
        terminal.setCursorPosition(col, row);
        terminal.putCharacter(c);
        terminal.flush();
    }

}
