package projeto_java;

import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URI;

public class JavaGas {

	public static void main(String[] args) {
		Beneficiarios novoBene = new Beneficiarios();
		
        JOptionPane.showMessageDialog(null, "Olá, eu sou o GÁSpar!\nO seu assistente virtual e ficarei responsável pelo seu atendimento.\nAgora que eu já me apresentei, preciso saber com quem eu estou falando.");
        novoBene.setNome(JOptionPane.showInputDialog("Qual é o seu nome? "));
        
        novoBene.setUf(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() +", você reside no estado de  São Paulo? \n[1]SIM" + "  " + "[2]NÃO")));
        
        while (novoBene.getUf() == 1) {
        	
        	novoBene.setIdade(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() + ", qual a sua idade? ")));
        
                if (novoBene.getIdade() >= 18) {
            
                    } else {
                        JOptionPane.showMessageDialog(null, novoBene.getNome() + ", você é menor de idade, infelizmente não tem direito ao benefício.", "Informação" , JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
        
            novoBene.setPessoasFamilia(Integer.parseInt(JOptionPane.showInputDialog( novoBene.getNome() + ", quantas pessoas moram com você? ")));
        
            novoBene.setRenda(Double.parseDouble(JOptionPane.showInputDialog( novoBene.getNome() + ", qual a sua renda familiar? ")));
        
                if (novoBene.getRendaPerCapita() < 178.00) {
                    }else {
                    	JOptionPane.showMessageDialog(null, novoBene.getNome() + ", você tem uma renda per capita maior que R$ 178.00. De acordo com as nossas regras, você não tem direito ao benefício.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } 
        
            
                novoBene.setBolsaFamilia(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() + ", você possui cadastro no Bolsa Família? \n[1]SIM" + "  " + "[2]NÃO")));
        
                if (novoBene.getBolsaFamilia() == 2) {
            
                    } else {
                    	JOptionPane.showMessageDialog(null, novoBene.getNome() + ", por ser um beneficiário do Bolsa Família, você não tem direito ao Vale Gás.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                        break;    
                    }
        
                novoBene.setCadUnico(Integer.parseInt(JOptionPane.showInputDialog(novoBene.getNome() + ", você está participando do Cadastro Único? \n[1]SIM"+ "  " +"[2]NÃO")));
                    
                if (novoBene.getCadUnico() == 1) {
            
                } else {
                    JOptionPane.showMessageDialog(null,novoBene.getNome() + ", você não é participante do Cadastro Único, se dirija ao CRAS mais próximo para realizar o cadastro.\n\n Para localizar o CRAS mais próximo clique em OK.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    try {
                    	URI link2 = new URI("www.encurtador.com.br/ceqF0");
                    	Desktop.getDesktop().browse(link2);
                    }
                    catch(Exception erro) {
                    	System.out.println(erro);
                    }
                    break;
                }
                
                JOptionPane.showMessageDialog(null, novoBene.getNome() + ", você atende a todos os requisitos e tem direito ao benefício do Vale Gás!\n\nPara realizar o cadastro tenha em mãos o número do seu NIS/PIS e clique no botão OK para ser redirecionado ao site." , "Informação", JOptionPane.INFORMATION_MESSAGE);
                try {
                	URI link = new URI("www.bolsadopovo.sp.gov.br");
                	Desktop.getDesktop().browse(link);
                }
                catch(Exception erro) {
                	System.out.println(erro);
                }
                break;
            }         
                if (novoBene.getUf() == 2 ) {
                    JOptionPane.showMessageDialog(null, novoBene.getNome() + ", infelizmente você está fora do estado de São Paulo, e o benefício só contempla esse estado!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                } 
    }    
}