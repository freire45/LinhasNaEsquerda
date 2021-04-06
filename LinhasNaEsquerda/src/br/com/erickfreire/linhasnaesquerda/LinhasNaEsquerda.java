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
		
		super.paintComponent(g);
		
		int i = 1;
		int y = 0;
		
		while(i <= 15) {
			   
			g.drawLine(0, 0, getWidth()/2, getHeight()/2 - y);
			y += 10;
			i++;
		}
		
	}

}
