package br.cesjf.lpwsd.maven.model;

import br.cesjf.lpwsd.maven.model.TbExemplar;
import br.cesjf.lpwsd.maven.model.TbUsuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T21:46:25")
@StaticMetamodel(TbEmprestimo.class)
public class TbEmprestimo_ { 

    public static volatile SingularAttribute<TbEmprestimo, Date> dataEmprestimo;
    public static volatile SingularAttribute<TbEmprestimo, Integer> idtbEmprestimo;
    public static volatile SingularAttribute<TbEmprestimo, TbUsuario> tbUsuarioidtbUsuario;
    public static volatile SingularAttribute<TbEmprestimo, TbExemplar> tbExemplaridtbExemplar;

}