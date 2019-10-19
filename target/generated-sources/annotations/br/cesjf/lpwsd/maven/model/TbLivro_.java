package br.cesjf.lpwsd.maven.model;

import br.cesjf.lpwsd.maven.model.TbAssunto;
import br.cesjf.lpwsd.maven.model.TbAutores;
import br.cesjf.lpwsd.maven.model.TbEditora;
import br.cesjf.lpwsd.maven.model.TbExemplar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T21:46:25")
@StaticMetamodel(TbLivro.class)
public class TbLivro_ { 

    public static volatile SingularAttribute<TbLivro, Date> ano;
    public static volatile SingularAttribute<TbLivro, TbEditora> tbEditoraidtbEditora;
    public static volatile SingularAttribute<TbLivro, String> isbn;
    public static volatile SingularAttribute<TbLivro, Integer> idtbLivro;
    public static volatile SingularAttribute<TbLivro, String> titulo;
    public static volatile ListAttribute<TbLivro, TbExemplar> tbExemplarList;
    public static volatile SingularAttribute<TbLivro, Integer> edicao;
    public static volatile SingularAttribute<TbLivro, TbAssunto> tbAssuntoidtbAssunto;
    public static volatile ListAttribute<TbLivro, TbAutores> tbAutoresList;

}