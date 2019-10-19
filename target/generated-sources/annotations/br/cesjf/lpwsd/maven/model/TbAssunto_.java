package br.cesjf.lpwsd.maven.model;

import br.cesjf.lpwsd.maven.model.TbLivro;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T21:46:25")
@StaticMetamodel(TbAssunto.class)
public class TbAssunto_ { 

    public static volatile SingularAttribute<TbAssunto, String> assunto;
    public static volatile ListAttribute<TbAssunto, TbLivro> tbLivroList;
    public static volatile SingularAttribute<TbAssunto, String> nomeAssunto;
    public static volatile SingularAttribute<TbAssunto, String> descricaoAssunto;
    public static volatile SingularAttribute<TbAssunto, Integer> idtbAssunto;

}