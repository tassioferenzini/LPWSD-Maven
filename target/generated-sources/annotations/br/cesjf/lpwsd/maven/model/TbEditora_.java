package br.cesjf.lpwsd.maven.model;

import br.cesjf.lpwsd.maven.model.TbLivro;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T21:46:25")
@StaticMetamodel(TbEditora.class)
public class TbEditora_ { 

    public static volatile ListAttribute<TbEditora, TbLivro> tbLivroList;
    public static volatile SingularAttribute<TbEditora, Integer> idtbEditora;
    public static volatile SingularAttribute<TbEditora, String> nomeEditora;

}