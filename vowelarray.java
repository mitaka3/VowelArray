/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class VowelArray {
    
      public static void main(String[] args)
    {
        int x;
        String[] vowel = {"a","e","i","o","u","A","E","I","O","U"};
        String vow;
        boolean validVowel = false;
        
        vow = JOptionPane.showInputDialog(null, "Enter a vowel");
        for (x=0 ; x< vowel.length; ++x)
            if(vow.equals(vowel[x]))
                    validVowel = true;
        
        if (validVowel)
            JOptionPane.showMessageDialog(null,"The vowel that you entered is: " + vow);
        
        else
            JOptionPane.showMessageDialog(null, "Invalid character used");
            
     
    }
    
}