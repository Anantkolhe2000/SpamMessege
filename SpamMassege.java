import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * main
 */
public class Solution {

public static void main(String[] args) throws InterruptedException, AWTException {

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the messege =");
   String msg=sc.nextLine();
   System.out.println("Enter the number of msg =");
   int size=sc.nextInt();
try{
   StringSelection stringSelection = new StringSelection(msg);

Clipboard clipboard =(Clipboard) Toolkit.getDefaultToolkit().getSystemClipboard();

((Clipboard) clipboard).setContents(stringSelection,null);

Thread.sleep(3000);
}catch(HeadlessException e){
System.out.println("");
}
Robot Robot= new Robot();
for (int i=0;i<size;i++){
Robot.keyPress(KeyEvent.VK_CONTROL);
Robot.keyPress(KeyEvent.VK_V);

Robot.keyRelease(KeyEvent.VK_CONTROL);
Robot.keyRelease(KeyEvent.VK_V);

Robot.keyPress(KeyEvent.VK_ENTER);
Robot.keyRelease(KeyEvent.VK_ENTER);



Thread.sleep(1000);
}
}
}