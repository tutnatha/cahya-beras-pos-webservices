/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.transformasi_satuan;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "transformasi_satuan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransformasiSatuan.findAll", query = "SELECT t FROM TransformasiSatuan t"),
    @NamedQuery(name = "TransformasiSatuan.findByJmlSumber", query = "SELECT t FROM TransformasiSatuan t WHERE t.jmlSumber = :jmlSumber"),
    @NamedQuery(name = "TransformasiSatuan.findBySatuanSumber", query = "SELECT t FROM TransformasiSatuan t WHERE t.transformasiSatuanPK.satuanSumber = :satuanSumber"),
    @NamedQuery(name = "TransformasiSatuan.findByJmlHasil", query = "SELECT t FROM TransformasiSatuan t WHERE t.jmlHasil = :jmlHasil"),
    @NamedQuery(name = "TransformasiSatuan.findBySatuanHasil", query = "SELECT t FROM TransformasiSatuan t WHERE t.transformasiSatuanPK.satuanHasil = :satuanHasil")})
public class TransformasiSatuan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransformasiSatuanPK transformasiSatuanPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "jml_sumber")
    private BigDecimal jmlSumber;
    @Column(name = "jml_hasil")
    private BigDecimal jmlHasil;

    public TransformasiSatuan() {
    }

    public TransformasiSatuan(TransformasiSatuanPK transformasiSatuanPK) {
        this.transformasiSatuanPK = transformasiSatuanPK;
    }

    public TransformasiSatuan(String satuanSumber, String satuanHasil) {
        this.transformasiSatuanPK = new TransformasiSatuanPK(satuanSumber, satuanHasil);
    }

    public TransformasiSatuanPK getTransformasiSatuanPK() {
        return transformasiSatuanPK;
    }

    public void setTransformasiSatuanPK(TransformasiSatuanPK transformasiSatuanPK) {
        this.transformasiSatuanPK = transformasiSatuanPK;
    }

    public BigDecimal getJmlSumber() {
        return jmlSumber;
    }

    public void setJmlSumber(BigDecimal jmlSumber) {
        this.jmlSumber = jmlSumber;
    }

    public BigDecimal getJmlHasil() {
        return jmlHasil;
    }

    public void setJmlHasil(BigDecimal jmlHasil) {
        this.jmlHasil = jmlHasil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transformasiSatuanPK != null ? transformasiSatuanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransformasiSatuan)) {
            return false;
        }
        TransformasiSatuan other = (TransformasiSatuan) object;
        if ((this.transformasiSatuanPK == null && other.transformasiSatuanPK != null) || (this.transformasiSatuanPK != null && !this.transformasiSatuanPK.equals(other.transformasiSatuanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.transformasi_satuan.TransformasiSatuan[ transformasiSatuanPK=" + transformasiSatuanPK + " ]";
    }
    
}
