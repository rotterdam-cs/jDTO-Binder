package com.juancavallotti.jdto.impl.xml;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author juancavallotti
 */
@XmlRootElement(name = "dto")
@XmlAccessorType(XmlAccessType.PROPERTY)
class DTOElement implements Serializable {

    private static final long serialVersionUID = 1L;
    private String type;
    private List<String> beanNames;

    public DTOElement() {
    }
    
    @XmlAttribute(name="type", required = true)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @XmlElementWrapper(name="sourceNames")
    @XmlElement(name = "beanName")
    public List<String> getBeanNames() {
        return beanNames;
    }

    public void setBeanNames(List<String> beanNames) {
        this.beanNames = beanNames;
    }
    
    
}
