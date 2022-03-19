package calculadora.src.com.elifelipe.visao;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Botao extends JButton{
    
    public Botao(String texto, Color cor){
        setText(texto);
        setFont(new Font("courier", Font.PLAIN, 25));
        setBackground(cor);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
