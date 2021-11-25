import javax.swing.JOptionPane;

public abstract class Item {
    private String descricao;
    private Double valor;


    public Item (String d, Double v){
        this.descricao = d;
        this.valor = v;
    }

    public void exibir(){
        JOptionPane.showMessageDialog(null, String.format("%s: %.2f", this.descricao, this.valor));
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
    
}
