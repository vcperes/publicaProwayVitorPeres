package Classes;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Janela {
	
	//Declaração de variáveis
	private JFrame frame;
	private JTable tabelaJogos = new JTable();
	private Object[] linha;
	private DefaultTableModel model;
	
	private JButton btnAdicionar = new JButton();
	private JButton btnDeletar = new JButton();
    private JButton btnAtualizar = new JButton();     
    private JButton btnTemporada = new JButton();
    private JButton btnRecordes = new JButton();
    
    private JTextField entradaJogo;
    private JTextField entradaPlacar;
    private JTextField entradaMinTemp;
    private JTextField entradaMaxTemp;
    private JTextField entradaRecMin;
    private JTextField entradaRecMax;
    
    private JLabel labelJogo;
    private JLabel labelPlacar;
    private JLabel labelMinTemp ;
    private JLabel labelMaxTemp;
    private JLabel labelRecMin;
    private JLabel labelRecMax;
    
    private JLabel labelMedia;
    private JLabel labelDiferenca;
	
    //Inicialização da classe
	public Janela() {
		
	}
	
	//Método que constrói a janela
	public void inicializaJanela() {
			
			//Cria frame e tabela
		 	frame = new JFrame();		
	        tabelaJogos = new JTable(); 
	    
	        //Cria títulos da coluna, e atribui modelo para tabela
	        Object[] columns = {"JOGO","PLACAR","MÍNIMO DA TEMPORADA","MÁXIMO DA TEMPORADA","RECORDE MÍNIMO","RECORDE MÁXIMO"};
	        model = new DefaultTableModel();
	        model.setColumnIdentifiers(columns);
	        
	        tabelaJogos.setModel(model);
	        
	        //Fixa colunas para o usuário, cálculos são feitos com base na posição das colunas
	        tabelaJogos.getTableHeader().setReorderingAllowed(false);
	        
	        //Altura da coluna e cor e fonte da tabela
	        tabelaJogos.setBackground(Color.LIGHT_GRAY);
	        tabelaJogos.setForeground(Color.black);
	        Font font = new Font("",1,22);
	        tabelaJogos.setFont(font);
	        tabelaJogos.setRowHeight(30);
	      
	        //Inicialização dos campos de texto
	        entradaJogo = new JTextField();
	        entradaPlacar = new JTextField();
	        entradaMinTemp = new JTextField();
	        entradaMaxTemp = new JTextField();
	        entradaRecMin = new JTextField();
	        entradaRecMax = new JTextField();
	        
	        //Inicialização dos botões
	        btnAdicionar = new JButton("Adicionar");
	        btnDeletar = new JButton("Deletar");
	        btnAtualizar = new JButton("Atualizar");     
	        btnTemporada = new JButton("C\u00E1lculo da temporada");
	        btnRecordes = new JButton("C\u00E1lculo de recordes");
	        
	        //Tamanho e posição no layout dos campos de texto
	        entradaJogo.setBounds(54, 222, 100, 25);
	        entradaPlacar.setBounds(184, 220, 100, 25);
	        entradaMinTemp.setBounds(311, 220, 100, 25);
	        entradaMaxTemp.setBounds(438, 220, 100, 25);
	        entradaRecMin.setBounds(568, 220, 100, 25);
	        entradaRecMax.setBounds(697, 220, 100, 25);
	        
	        //Tamanho e posição no layout dos botões
	        btnAdicionar.setBounds(210, 298, 133, 37);
	        btnAtualizar.setBounds(383, 298, 133, 37);
	        btnDeletar.setBounds(559, 298, 133, 37);
	        btnTemporada.setBounds(54, 371, 164, 37);
	        btnRecordes.setBounds(54, 438, 164, 37);
	        
	        //Componente que coloca barra de rolagem na tabela
	        JScrollPane painel = new JScrollPane(tabelaJogos);
	        painel.setBounds(0, 0, 880, 200);
	   
	        //Adição de painel, campos de texto e botões na janela
	        frame.getContentPane().setLayout(null);
	        
	        frame.getContentPane().add(painel);
	        
	        frame.getContentPane().add(entradaJogo);
	        frame.getContentPane().add(entradaPlacar);
	        frame.getContentPane().add(entradaMinTemp);
	        frame.getContentPane().add(entradaMaxTemp);
	        frame.getContentPane().add(entradaRecMin);
	        frame.getContentPane().add(entradaRecMax);
	        
	        frame.getContentPane().add(btnAdicionar);
	        frame.getContentPane().add(btnDeletar);
	        frame.getContentPane().add(btnAtualizar);
	        frame.getContentPane().add(btnTemporada);
	        frame.getContentPane().add(btnRecordes);
	      
	        //Etiquetas para campos de texto
	        labelJogo = new JLabel("Jogo");
	        labelPlacar = new JLabel("Placar");
	        labelMinTemp = new JLabel("M\u00EDnimo da temporada");
	        labelMaxTemp = new JLabel("M\u00E1ximo da temporada");
	        labelRecMin = new JLabel("Recorde m\u00EDnimo");
	        labelRecMax = new JLabel("Recorde m\u00E1ximo");
	        
	        //Etiquetas variáveis
	        labelMedia = new JLabel("M\u00E9dia de pontos: ");
	        labelDiferenca = new JLabel("Diferen\u00E7a de pontos:");
	        
	        //Tamanho e posição no layout das etiquetas
	        labelJogo.setBounds(54, 247, 46, 14);
	        labelPlacar.setBounds(184, 247, 46, 14);
	        labelMinTemp.setBounds(311, 247, 120, 14);
	        labelMaxTemp.setBounds(438, 247, 111, 14);
	        labelRecMin.setBounds(568, 247, 100, 14);
	        labelRecMax.setBounds(697, 247, 100, 14);
	        labelMedia.setBounds(280, 366, 517, 49);
	        labelDiferenca.setBounds(280, 426, 517, 49);
	        
	        //Adição das etiquetas na janela
	        frame.getContentPane().add(labelPlacar);
	        frame.getContentPane().add(labelMinTemp);
	        frame.getContentPane().add(labelMaxTemp);
	        frame.getContentPane().add(labelRecMin);
	        frame.getContentPane().add(labelRecMax);
	        frame.getContentPane().add(labelJogo);
	        frame.getContentPane().add(labelMedia);
	        frame.getContentPane().add(labelDiferenca);
	        
	        //Estilização das etiquetas variáveis
	        labelMedia.setFont(new Font("Tahoma", Font.BOLD, 19));
	        labelDiferenca.setFont(new Font("Tahoma", Font.BOLD, 19));
	        
	        //Dados nativos da aplicação
	        Object[] jogo1 = {1, 12, 12, 12, 0, 0};
	        Object[] jogo2 = {2, 24, 12, 24, 0, 1};
	        Object[] jogo3 = {3, 10, 10, 24, 1, 1};
	        Object[] jogo4 = {4, 24, 10, 24, 1, 1};
	 
	        //Adição de vetores de objetos às linhas da tabela
	        model.addRow(jogo1);
	        model.addRow(jogo2);
	        model.addRow(jogo3);
	        model.addRow(jogo4);
	        
	        //Tamanho, posição no layout, botão para sair como padrão e visibilidade da janela
	        frame.setSize(900,564);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	}
	
	//Método que constrói funcionalidade dos botões
	public void inicializaBotoes(){
		
		//Inicialização do número de colunas
		linha = new Object[6];
        btnAdicionar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
            	//Atribuição de dados do campo de texto para dentro do objeto vetor
            	linha[0] = Integer.parseInt(entradaJogo.getText());
                linha[1] = Integer.parseInt(entradaPlacar.getText());
                linha[2] = Integer.parseInt(entradaMinTemp.getText());
                linha[3] = Integer.parseInt(entradaMaxTemp.getText());
                linha[4] = Integer.parseInt(entradaRecMin.getText());
                linha[5] = Integer.parseInt(entradaRecMax.getText());
                
                	//Verificação do número do placar: não pode passar de 1000
                   int a = Integer.parseInt(entradaPlacar.getText());
                
            	   if(a<1000) {
            		   
            		   //Caso placar seja menor, vetor é adicionado à linha da tabela
            		   model.addRow(linha);
            		   
            	   }else {
            		   
            		   JOptionPane.showMessageDialog(null, "A pontuação não pode passar de 1000! ");
            	   }
               
            }
        });
        
        btnDeletar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                //Recebe posição da linha selecionada
                int i = tabelaJogos.getSelectedRow();
                if(i >= 0){
                   
                	//Remove linha selecionada
                    model.removeRow(i);
   
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        //Atualização de dados direto na tabela
        tabelaJogos.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            int i = tabelaJogos.getSelectedRow();
            
            entradaJogo.setText(model.getValueAt(i, 0).toString());
            entradaPlacar.setText(model.getValueAt(i, 1).toString());
            entradaMinTemp.setText(model.getValueAt(i, 2).toString());
            entradaMaxTemp.setText(model.getValueAt(i, 3).toString());
            entradaRecMin.setText(model.getValueAt(i, 4).toString());
            entradaRecMax.setText(model.getValueAt(i, 5).toString());
        }
        });
        
        //Atualização de dados já inseridos na tabela
        btnAtualizar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                int i = tabelaJogos.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(Integer.parseInt(entradaJogo.getText()), i, 0);
                   model.setValueAt(Integer.parseInt(entradaPlacar.getText()), i, 1);
                   model.setValueAt(Integer.parseInt(entradaMinTemp.getText()), i, 2);
                   model.setValueAt(Integer.parseInt(entradaMaxTemp.getText()), i, 3);
                   model.setValueAt(Integer.parseInt(entradaRecMin.getText()), i, 4);
                   model.setValueAt(Integer.parseInt(entradaRecMax.getText()), i, 5);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        //Cálculo de pontuação com base nos dados da tabela
        btnTemporada.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		int maior = 0;
        		int menor = 1000;
        		int media = 0;
        		for(int i=0;i<tabelaJogos.getRowCount();i++) {
        			
        			int temp = (Integer)tabelaJogos.getValueAt(i, 1);
             		media = media+temp;
        			
        			if((Integer)tabelaJogos.getValueAt(i, 1)> maior) {
        				
        				maior = (Integer)tabelaJogos.getValueAt(i, 1);
        				
        			}else if((Integer)tabelaJogos.getValueAt(i, 1) < menor) {
        				
        				menor = (Integer)tabelaJogos.getValueAt(i, 1);
        			}
        			
        		}
        		
        		int diferenca = maior - menor;
        		media = media/tabelaJogos.getRowCount();
        		labelMedia.setText("M\u00E9dia de pontos: "+media);
                labelDiferenca.setText("Diferen\u00E7a de pontos:"+diferenca);
        	}
        });
        
        //Cálculo de recordes com base nos dados da tabela
        btnRecordes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		int total =0;
        		int recMin =0;
        		int recMax=0;
        		
        		for(int i=0;i<tabelaJogos.getRowCount();i++) {
        			recMin = recMin+(Integer)tabelaJogos.getValueAt(i, 4);
        			recMax = recMax+(Integer)tabelaJogos.getValueAt(i, 5);
        			total = recMin + recMax;
        			
        		}
        		labelMedia.setText("Total de vezes em que o recorde foi quebrado: "+total);
                labelDiferenca.setText("Recordes mínimos: "+recMin+"  |  Recordes máximos: "+recMax);
        		
        	}
        });
        
        
	}

}
