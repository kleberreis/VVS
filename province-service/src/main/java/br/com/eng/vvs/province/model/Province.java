package br.com.eng.vvs.province.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;
import org.apache.tomcat.util.modeler.BaseModelMBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Province implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PROV_SEQ")
    @SequenceGenerator(sequenceName = "seq_province", name = "PROV_SEQ", allocationSize = 1)
    private Integer id;

    private String initials;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Province [id=" + id + ", initials=" + initials + ", name=" + name + "]";
    }

}
