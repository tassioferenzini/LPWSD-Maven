package br.cesjf.lpwsd.maven.model;

import br.cesjf.lpwsd.maven.model.TbEmprestimo;
import br.cesjf.lpwsd.maven.model.TbLivro;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T21:46:25")
@StaticMetamodel(TbExemplar.class)
public class TbExemplar_ { 

    public static volatile SingularAttribute<TbExemplar, Integer> idtbExemplar;
    public static volatile SingularAttribute<TbExemplar, TbLivro> tbLivroidtbLivro;
    public static volatile SingularAttribute<TbExemplar, Short> circular;
    public static volatile ListAttribute<TbExemplar, TbEmprestimo> tbEmprestimoList;

}