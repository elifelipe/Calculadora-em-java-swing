package calculadora.src.com.elifelipe.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import calculadora.src.com.elifelipe.modelo.Memoria;
import calculadora.src.com.elifelipe.modelo.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador{

    private final JLabel label;

    public Display() {

        Memoria.getInstancia().adicionarObservador((this));

        setBackground(new Color(28, 23,36));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier",Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
