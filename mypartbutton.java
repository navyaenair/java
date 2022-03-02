import java.io.IOException;

import javax.swing.JOptionPane;

public class mypartbutton {
    private void jButtonResetActionPerformed(java.awt.event.ActionEvent avt)
    {
        jTextMessage.setText("");
        sourceImage=null;
        EmbeddedImage=null;
        jLabelsourceImage=setIcon(null);
        jLabelEmbedded.setIcon(null)
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent avt){
        if(EmbeddedImage == null){
                   JOptionPane.showMessageDialog(this."No message has been embedded,"Nothing to save", JOptionPane.ERROR_MESSAGE);

        }
        else
        {
            File file = showFileDialog(False);
                     if(file == null)
                         return;
        }
        String name= file.getName();
        String Extention=name.substring(name.lastIndexOf(",")+1).toLowercase();
        if(!Extention.equals("png") && !Extention.equals("bmp")){
            Extention="png";
            file = new File(file.getAbsolutePath()+".png");
        }
        if(file.exists())  file.delete();
        try{
        ImageIO.write(EmbeddedImage.Extention.toUpercase().file);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        }
}
