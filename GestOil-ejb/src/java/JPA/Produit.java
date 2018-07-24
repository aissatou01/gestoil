/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aissatou
 */
@Entity
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByCode", query = "SELECT p FROM Produit p WHERE p.code = :code"),
    @NamedQuery(name = "Produit.findByDateajout", query = "SELECT p FROM Produit p WHERE p.dateajout = :dateajout"),
    @NamedQuery(name = "Produit.findByQuantite", query = "SELECT p FROM Produit p WHERE p.quantite = :quantite"),
    @NamedQuery(name = "Produit.findByMontant", query = "SELECT p FROM Produit p WHERE p.montant = :montant"),
    @NamedQuery(name = "Produit.findByResponsable", query = "SELECT p FROM Produit p WHERE p.responsable = :responsable"),
    @NamedQuery(name = "Produit.findByIndexdepart", query = "SELECT p FROM Produit p WHERE p.indexdepart = :indexdepart"),
    @NamedQuery(name = "Produit.findByIndexarrive", query = "SELECT p FROM Produit p WHERE p.indexarrive = :indexarrive")})
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "code")
    private String code;
    @Column(name = "dateajout")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateajout;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantite")
    private Double quantite;
    @Column(name = "montant")
    private Double montant;
    @Size(max = 45)
    @Column(name = "responsable")
    private String responsable;
    @Column(name = "indexdepart")
    private Double indexdepart;
    @Column(name = "indexarrive")
    private Double indexarrive;
    @JoinColumn(name = "station_code", referencedColumnName = "code")
    @ManyToOne(optional = false)
    private Station stationCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produitCode")
    private List<Categorieproduit> categorieproduitList;

    public Produit() {
    }

    public Produit(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateajout() {
        return dateajout;
    }

    public void setDateajout(Date dateajout) {
        this.dateajout = dateajout;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Double getIndexdepart() {
        return indexdepart;
    }

    public void setIndexdepart(Double indexdepart) {
        this.indexdepart = indexdepart;
    }

    public Double getIndexarrive() {
        return indexarrive;
    }

    public void setIndexarrive(Double indexarrive) {
        this.indexarrive = indexarrive;
    }

    public Station getStationCode() {
        return stationCode;
    }

    public void setStationCode(Station stationCode) {
        this.stationCode = stationCode;
    }

    @XmlTransient
    public List<Categorieproduit> getCategorieproduitList() {
        return categorieproduitList;
    }

    public void setCategorieproduitList(List<Categorieproduit> categorieproduitList) {
        this.categorieproduitList = categorieproduitList;
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
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Produit[ code=" + code + " ]";
    }
    
}
