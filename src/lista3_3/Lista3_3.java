package lista3_3;

import javax.swing.JOptionPane;

public class Lista3_3 {
    public static void main(String[] args) {
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade em ano: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os meses com essa idade: "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os dias nesse mes: "));
        ano *= 365;
        mes *= 30;
        dia = dia + ano + mes;
        JOptionPane.showMessageDialog(null, "Você tem " + dia + " dias de vida");
    }    
}
