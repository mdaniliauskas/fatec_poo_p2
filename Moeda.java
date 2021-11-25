import javax.swing.JOptionPane;

public class Moeda extends Item{
    public Moeda (Double valor){
        super("Moeda", valor);
    }

    public void exibir(){ 
        JOptionPane.showMessageDialog(null, String.format("%s: R$ %.2f", getDescricao(), getValor()));
    }
}