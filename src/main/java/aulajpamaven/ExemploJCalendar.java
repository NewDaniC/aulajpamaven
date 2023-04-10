package aulajpamaven;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;

public class ExemploJCalendar {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Exemplo JCalendar");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setPreferredSize(new Dimension(400, 200));

		JDateChooser escolherData = new JDateChooser();
		
		escolherData.setPreferredSize(new Dimension(200, 30));

		JButton exibirDataBtn = new JButton("Exibir Data");

		exibirDataBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				Date dataSelecionada = escolherData.getDate();
				JOptionPane.showMessageDialog(janela, "Data selecionada: " + dataSelecionada);
				System.out.println("Data selecionada: " + dataSelecionada);

				String dataSelecionadaStr = sdf.format(dataSelecionada);
				System.out.println("Data selecionada: " + dataSelecionadaStr);
			}
		});

		JLabel label = new JLabel("Formato: (dia) de (mês) de (ano)");
		janela.getContentPane().add(label, BorderLayout.CENTER);
		janela.getContentPane().add(escolherData, BorderLayout.NORTH);
		janela.getContentPane().add(exibirDataBtn, BorderLayout.SOUTH);

		janela.pack();
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
}