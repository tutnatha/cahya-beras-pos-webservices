/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.transformasi_satuan;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author tutnatha
 */
@Embeddable
public class TransformasiSatuanPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "satuan_sumber")
    private String satuanSumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "satuan_hasil")
    private String satuanHasil;

    public TransformasiSatuanPK() {
    }

    public TransformasiSatuanPK(String satuanSumber, String satuanHasil) {
        this.satuanSumber = satuanSumber;
        this.satuanHasil = satuanHasil;
    }

    public String getSatuanSumber() {
        return satuanSumber;
    }

    public void setSatuanSumber(String satuanSumber) {
        this.satuanSumber = satuanSumber;
    }

    public String getSatuanHasil() {
        return satuanHasil;
    }

    public void setSatuanHasil(String satuanHasil) {
        this.satuanHasil = satuanHasil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (satuanSumber != null ? satuanSumber.hashCode() : 0);
        hash += (satuanHasil != null ? satuanHasil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransformasiSatuanPK)) {
            return false;
        }
        TransformasiSatuanPK other = (TransformasiSatuanPK) object;
        if ((this.satuanSumber == null && other.satuanSumber != null) || (this.satuanSumber != null && !this.satuanSumber.equals(other.satuanSumber))) {
            return false;
        }
        if ((this.satuanHasil == null && other.satuanHasil != null) || (this.satuanHasil != null && !this.satuanHasil.equals(other.satuanHasil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.transformasi_satuan.TransformasiSatuanPK[ satuanSumber=" + satuanSumber + ", satuanHasil=" + satuanHasil + " ]";
    }
    
}
