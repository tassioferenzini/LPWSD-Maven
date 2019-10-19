/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpwsd.bean;


import br.cesjf.lpwsd.dao.AssuntoDAO;
import br.cesjf.lpwsd.model.TbAssunto;
import br.cesjf.lpwsd.reports.Relatorio;
import java.util.ArrayList;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import java.io.IOException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

/**
 *
 * @author tassio
 */
@ManagedBean
@ViewScoped
public class assuntoBean {

    TbAssunto assunto = new TbAssunto();

    List assuntos = new ArrayList();

    //construtor
    public assuntoBean() {
        assuntos = new AssuntoDAO().buscarTodas();
        assunto = new TbAssunto();
    }
    
    //Métodos dos botões 
    public void record(ActionEvent actionEvent) {
        new AssuntoDAO().persistir(assunto);
        assuntos = new AssuntoDAO().buscarTodas();
        assunto = new TbAssunto();
    }

    public void exclude(ActionEvent actionEvent) {
        new AssuntoDAO().remover(assunto);
        assuntos = new AssuntoDAO().buscarTodas();
        assunto = new TbAssunto();
    }

    //getters and setters
    public TbAssunto getAssunto() {
        return assunto;
    }

    public void setAssunto(TbAssunto assunto) {
        this.assunto = assunto;
    }

    public List getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List assuntos) {
        this.assuntos = assuntos;
    }

    public void postProcessXLS(Object document) {
        HSSFWorkbook wb = (HSSFWorkbook) document;
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow header = sheet.getRow(0);

        HSSFCellStyle cellStyle = wb.createCellStyle();
        //cellStyle.setFillForegroundColor(HSSFColor.GREEN.index);
        //cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
            HSSFCell cell = header.getCell(i);

            cell.setCellStyle(cellStyle);
        }
    }

    public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
        Document pdf = (Document) document;
        pdf.open();
        pdf.setPageSize(PageSize.A4);

        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();

    }
    
    public void gerarRelatorioAction() {
        Relatorio relatorio = new Relatorio();
        relatorio.getRelatorio();
    }

}
