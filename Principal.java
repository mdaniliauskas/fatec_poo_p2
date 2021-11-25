import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        List <Item> colecao = new ArrayList<>();
        String menu = "1-Adicionar um item a colecao\n2-Inventario da colecao\n3-Valor total da colecao\n0-Sair";
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:{
                    String menu1 = "1-Moeda\n2-Selo Regular\n3-Selo Comemorativo";
                    int op1 = Integer.parseInt(JOptionPane.showInputDialog(menu1));
                    String d;
                    Double v;
                    switch (op1) {
                        case 1:{
                            v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da moeda: "));
                            colecao.add(new Moeda(v));
                            break;
                        }                                               
                        case 2:{
                            d = JOptionPane.showInputDialog("Digite a descricao do selo regular: ");
                            v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do selo regular: "));
                            colecao.add(new SeloRegular(d, v));
                            break; 
                        }
                        case 3:{
                            d = JOptionPane.showInputDialog("Digite a descricao do selo comemorativo: ");
                            v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do selo comemorativo: "));                             
                            colecao.add(new SeloComemorativo(d, v));
                            break; 
                        }                    
                        default:{
                            JOptionPane.showMessageDialog(null, "Digite uma opcao valida!");
                            break;
                        }
                    }
                    break;
                }
                case 2:{                    
                    for (Item i : colecao) {
                        i.exibir();
                    }
                    break;
                }
                case 3:{                    
                    Double soma = 0.0;
                    for (Item i : colecao) {                        

                        soma = soma + i.getValor();
                    }
                    JOptionPane.showMessageDialog(null, String.format("O valor total da colecao e: %.2f", soma));                      
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Digite uma opcao valida!");
                    break;
                }
                    
            }

        }while(op != 0);
    }
}