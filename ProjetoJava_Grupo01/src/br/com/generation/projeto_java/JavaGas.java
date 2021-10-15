package br.com.generation.projeto_java;

import java.awt.Desktop;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JavaGas {

	public static void main(String[] args) {

		Beneficiarios novoBene = new Beneficiarios();

		ImageIcon icone = new ImageIcon("bin/br/com/generation/Imagem/ValeJavaGás.png");

		Object Options[] = { "Próximo >" };

		JOptionPane.showOptionDialog(null,
				"Olá, eu sou o GÁSpar!\nO seu assistente virtual e " + "ficarei responsável pelo seu atendimento.\n"
						+ "Agora que eu já me apresentei, preciso saber com quem eu estou falando.",
				"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, Options, null);

		novoBene.setNome(
				(String) JOptionPane.showInputDialog(null, "Qual o seu nome?", "ValeJavaGás", 0, icone, null, null));

		Object yes[] = { "SIM", "NÃO" };

		novoBene.setUf(JOptionPane.showOptionDialog(null, novoBene.getNome() + ", você reside no estado de  São Paulo?",
				"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, yes, null));

		while (novoBene.getUf() == 0) {

			novoBene.setIdade(Integer.parseInt((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", qual a sua idade? ", "ValeJavaGás", 0, icone, null, null)));

			if (novoBene.getIdade() >= 18) {

			} else {
				JOptionPane.showInternalMessageDialog(null,
						novoBene.getNome() + ", você é menor de idade, infelizmente " + "não tem direito ao benefício.",
						"ValeJavaGás", 0, icone);
				break;
			}

			novoBene.setPessoasFamilia(Integer.parseInt((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", quantas pessoas moram com você? ", "ValeJavaGás", 0, icone, null, null)));

			novoBene.setRenda(Double.parseDouble((String) JOptionPane.showInputDialog(null,
					novoBene.getNome() + ", qual a sua renda familiar? ", "ValeJavaGás", 0, icone, null, null)));

			if (novoBene.getRendaPerCapita() < 178.00) {

			} else {
				JOptionPane.showInternalMessageDialog(null, novoBene.getNome() + ", você tem uma renda per capita"
						+ " maior que R$ 178.00.\nDe acordo com as nossas regras, você não tem direito ao benefício.",
						"ValeJavaGás", 0, icone);
				break;
			}

			Object yesB[] = { "SIM", "NÃO" };

			novoBene.setBolsaFamilia(JOptionPane.showOptionDialog(null,
					novoBene.getNome() + ", você possui cadastro no" + " Bolsa Família?", "ValeJavaGás",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, yesB, null));

			if (novoBene.getBolsaFamilia() == 1) {

			} else {
				JOptionPane.showInternalMessageDialog(null, novoBene.getNome()
						+ ", por ser um beneficiário do Bolsa Família," + " você não tem direito ao Vale Gás.",
						"ValeJavaGás", 0, icone);
				break;
			}

			Object yesCad[] = { "SIM", "NÃO" };

			novoBene.setCadUnico(JOptionPane.showOptionDialog(null,
					novoBene.getNome() + ", você está participando do Cadastro Único?", "ValeJavaGás",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, yesCad, null));

			if (novoBene.getCadUnico() == 0) {

			} else {
				Object CRAS[] = { "Clique Aqui!" };

				JOptionPane.showOptionDialog(null, novoBene.getNome()
						+ ", você não é participante do Cadastro Único, se dirija ao CRAS mais próximo \n"
						+ "para realizar o cadastro.\n\nPara localizar o CRAS mais próximo clique em CLIQUE AQUI!.",
						"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, CRAS, null);

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
					"ValeJavaGás", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone, valeGas, null);

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
							+ "\ne o benefício só contempla esse estado!",
					"ValeJavaGás", 0, icone);
		}
	}
}