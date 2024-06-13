package br.unigran.view.cadastro;

import br.unigran.persistencia.Dao;
import net.sf.jasperreports.engine.*;

import java.sql.Connection;
import java.util.Map;

public class Relatorio {
    public static JasperPrint relatorio(String lugar, Map<String, Object> parametros) throws JRException {
        Dao.getInstace().getEm().getTransaction().begin();
        Connection con = Dao.getInstace().getEm().unwrap(Connection.class);
        JasperReport report = JasperCompileManager.compileReport(Relatorio.class.getClassLoader().getResource(lugar).getFile());
        JasperPrint print = JasperFillManager.fillReport(report, parametros, con);
        Dao.getInstace().getEm().getTransaction().commit();
        return print;
    }
}
