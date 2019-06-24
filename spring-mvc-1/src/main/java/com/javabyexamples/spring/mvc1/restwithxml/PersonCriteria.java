package com.javabyexamples.spring.mvc1.restwithxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "person")
public class PersonCriteria {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "lastName")
    private String lastName;
}
