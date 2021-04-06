package br.com.erickfreire.linhasnaesquerda;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha linhas na esquerda e insere elas dentro de uma janela gráfica
 * @author Erick Freire
 * @version 1 - Criado em 05-04-2021 as 23:40
 */

public class LinhasNaEsquerda extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		int largura = getWidth();
		int altura = getHeight();
		int contador = 1;
		int passos = 0;

		while (altura - passos >= 0) {

			g.drawLine(0, 0, passos, altura - passos);
			passos = passos + 15;
			contador++;

		}
		
	}

}
