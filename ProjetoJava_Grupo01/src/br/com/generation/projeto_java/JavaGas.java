package br.com.generation.projeto_java;

import java.awt.Desktop;
import java.net.URI;
import java.awt.Font;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JavaGas {

	public static void main(String[] args) {
				 
		   		    
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Verdana", Font.BOLD, 25))); 
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Verdana", Font.BOLD, 25)));
			   

		Beneficiarios novoBene = new Beneficiarios();

		ImageIcon icone = new ImageIcon("bin/Imagens/Gaspar.png");
		ImageIcon gaspar = new ImageIcon("bin/Imagens/Gaspar2.png");

		Object Options[] = { "Próximo >"};

		JOptionPane.showOptionDialog(null,
				"Sou o seu assistente virtual e ficarei \nresponsável pelo seu atendimento.\nMas, vamos lá...",
				"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, Options, null);

		novoBene.setNome((String) JOptionPane.showInputDialog(null, "Qual o seu nome?", "ValeJavaGás",0, gaspar, null, null));

		Object yes[] = { "SIM", "NÃO" };

		novoBene.setUf(JOptionPane.showOptionDialog(null, novoBene.getNome() + ", você reside no estado de São Paulo?",
				"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, yes, null));

		while (novoBene.getUf() == 0) {

			novoBene.setIdade(Integer.parseInt((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", qual a sua idade? ", "ValeJavaGás", 0, gaspar, null, null)));

			if (novoBene.getIdade() >= 18) {

			} else {
				JOptionPane.showInternalMessageDialog(null,
						novoBene.getNome() + ", você é menor de idade, infelizmente " + "não tem direito ao benefício.",
						"ValeJavaGás", 0, gaspar);
				break;
			}

			novoBene.setPessoasFamilia(Integer.parseInt((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", quantas pessoas moram com você? ", "ValeJavaGás", 0, gaspar, null, null)));

			novoBene.setRenda(Double.parseDouble((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", qual a sua renda familiar? ", "ValeJavaGás", 0, gaspar, null, null)));

			if (novoBene.getRendaPerCapita() < 178.00) {

			} else {
				JOptionPane.showInternalMessageDialog(null, novoBene.getNome() + ", você tem uma renda per capita"
						+ " maior que R$ 178.00.\nDe acordo com as nossas regras, você não tem direito ao benefício.",
						"ValeJavaGás", 0, gaspar);
				break;
			}

			Object yesB[] = { "SIM", "NÃO" };

			novoBene.setBolsaFamilia(JOptionPane.showOptionDialog(null,
					novoBene.getNome() + ", você possui cadastro no" + " Bolsa Família?", "ValeJavaGás",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, yesB, null));

			if (novoBene.getBolsaFamilia() == 1) {

			} else {
				JOptionPane.showInternalMessageDialog(null, novoBene.getNome()
						+ ", por ser um beneficiário do Bolsa Família," + " você não tem direito ao Vale Gás.",
						"ValeJavaGás", 0, gaspar);
				break;
			}

			Object yesCad[] = { "SIM", "NÃO" };

			novoBene.setCadUnico(JOptionPane.showOptionDialog(null,
					novoBene.getNome() + ", você está participando do Cadastro Único?", "ValeJavaGás",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, yesCad, null));

			if (novoBene.getCadUnico() == 0) {

			} else {
				Object CRAS[] = { "Clique Aqui!" };

				JOptionPane.showOptionDialog(null, novoBene.getNome()
						+ ", você não é participante do Cadastro Único, se dirija ao CRAS mais próximo \n"
						+ "para realizar o cadastro.\n\nPara localizar o CRAS mais próximo clique em CLIQUE AQUI!.",
						"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, CRAS, null);

				try {
					URI link2 = new URI("www.encurtador.com.br/ceqF0");
					Desktop.getDesktop().browse(link2);
				} catch (Exception erro) {
					System.out.println(erro);
				}
				break;
			}

			Object valeGas[] = { "OK!" };

			JOptionPane.showOptionDialog(null, novoBene.getNome()
					+ ", você atende a todos os requisitos e tem direito ao benefício do Vale Gás!"
					+ "\n\nPara realizar o cadastro tenha em mãos o número do seu NIS/PIS e \nclique no botão OK! "
					+ "para ser redirecionado ao site.",
					"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, gaspar, valeGas, null);

			try {
				URI link = new URI("www.bolsadopovo.sp.gov.br");
				Desktop.getDesktop().browse(link);
			} catch (Exception erro) {
				System.out.println(erro);
			}
			break;
		}

		if (novoBene.getUf() == 1) {
			JOptionPane.showInternalMessageDialog(null,
					novoBene.getNome() + ", infelizmente você está fora do estado de São Paulo, "
							+ "\ne o benefício só contempla esse estado!","ValeJavaGás", 0, gaspar);
		}
	}
}