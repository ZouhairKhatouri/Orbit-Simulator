
package insertion;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

public abstract class InsertSpaceObject extends JFrame
{
    private static final String PARSING_ERROR = "PARSING ERROR";
    public HashMap<String,String> arg_value = new HashMap<>();
    
    public abstract void addNode() throws IOException, InterruptedException;

    protected void showErrorMessage()
    {
        JOptionPane.showMessageDialog(this, PARSING_ERROR);
    }
}
