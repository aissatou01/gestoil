/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aissatou
 */
@Entity
@Table(name = "categorieproduit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorieproduit.findAll", query = "SELECT c FROM Categorieproduit c"),
    @NamedQuery(name = "Categorieproduit.findByCode", query = "SELECT c FROM Categorieproduit c WHERE c.code = :code"),
    @NamedQuery(name = "Categorieproduit.findByType", query = "SELECT c FROM Categorieproduit c WHERE c.type = :type")})
public class Categorieproduit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @JoinColumn(name = "produit_code", referencedColumnName = "code")
    @ManyToOne(optional = false)
    private Produit produitCode;

    public Categorieproduit() {
    }

    public Categorieproduit(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Produit getProduitCode() {
        return produitCode;
    }

    public void setProduitCode(Produit produitCode) {
        this.produitCode = produitCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorieproduit)) {
            return false;
        }
        Categorieproduit other = (Categorieproduit) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Categorieproduit[ code=" + code + " ]";
    }
    
}
