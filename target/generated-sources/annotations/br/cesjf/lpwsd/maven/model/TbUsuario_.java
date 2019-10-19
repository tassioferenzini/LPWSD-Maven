package br.cesjf.lpwsd.maven.model;

import br.cesjf.lpwsd.maven.model.TbEmprestimo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T21:46:25")
@StaticMetamodel(TbUsuario.class)
public class TbUsuario_ { 

    public static volatile SingularAttribute<TbUsuario, String> nomeUsuario;
    public static volatile SingularAttribute<TbUsuario, String> senha;
    public static volatile SingularAttribute<TbUsuario, Integer> idtbUsuario;
    public static volatile ListAttribute<TbUsuario, TbEmprestimo> tbEmprestimoList;
    public static volatile SingularAttribute<TbUsuario, String> email;

}