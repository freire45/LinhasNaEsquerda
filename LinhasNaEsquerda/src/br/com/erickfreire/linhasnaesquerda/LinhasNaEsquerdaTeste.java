package br.com.erickfreire.linhasnaesquerda;

import javax.swing.JFrame;

public class LinhasNaEsquerdaTeste {
	public static void main(String[] args) {
		LinhasNaEsquerda painel = new LinhasNaEsquerda();

        JFrame applicacao = new JFrame();

        applicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicacao.add(painel); 
        applicacao.setSize(250, 250); 
        applicacao.setVisible(true);
	}

}
