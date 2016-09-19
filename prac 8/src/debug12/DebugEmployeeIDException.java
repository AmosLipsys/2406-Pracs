package debug12;

import javax.swing.*;

public class DebugEmployeeIDException extends Exception
{
   public DebugEmployeeIDException(String s)
   {
      super(s);
      JOptionPane.showMessageDialog(null, s);
   }
}


