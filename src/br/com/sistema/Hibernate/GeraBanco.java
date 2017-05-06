package br.com.sistema.Hibernate;

import javax.swing.JOptionPane;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraBanco {
    public static void main (String [] args){
    	
    	try {
    		Configuration cfg = new Configuration();
            cfg.configure();
            SchemaExport se = new SchemaExport(cfg);
            se.create(true, true);
            JOptionPane.showMessageDialog(null, "O Banco de Dados foi gerado com sucesso!",
            		"F�brica .:. Alerta",JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Gerar a Base de Dados!",
            	"F�brica .:. Alerta",JOptionPane.ERROR_MESSAGE);
		}
    }
}