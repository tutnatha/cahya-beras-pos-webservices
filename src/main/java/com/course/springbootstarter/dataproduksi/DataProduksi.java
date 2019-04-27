/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.dataproduksi;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "data_produksi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataProduksi.findAll", query = "SELECT d FROM DataProduksi d"),
    @NamedQuery(name = "DataProduksi.findByNoProduksi", query = "SELECT d FROM DataProduksi d WHERE d.noProduksi = :noProduksi"),
    @NamedQuery(name = "DataProduksi.findByTglProduksi", query = "SELECT d FROM DataProduksi d WHERE d.tglProduksi = :tglProduksi"),
    @NamedQuery(name = "DataProduksi.findByJenisProduk", query = "SELECT d FROM DataProduksi d WHERE d.jenisProduk = :jenisProduk"),
    @NamedQuery(name = "DataProduksi.findByJmlProduk", query = "SELECT d FROM DataProduksi d WHERE d.jmlProduk = :jmlProduk"),
    @NamedQuery(name = "DataProduksi.findByIdUser", query = "SELECT d FROM DataProduksi d WHERE d.idUser = :idUser"),
    @NamedQuery(name = "DataProduksi.findByBatchNo", query = "SELECT d FROM DataProduksi d WHERE d.batchNo = :batchNo")})
public class DataProduksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_produksi")
    private Integer noProduksi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tgl_produksi")
    @Temporal(TemporalType.DATE)
    private Date tglProduksi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "jenis_produk")
    private String jenisProduk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jml_produk")
    private int jmlProduk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "id_user")
    private String idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "batch_no")
    private int batchNo;

    public DataProduksi() {
    }

    public DataProduksi(Integer noProduksi) {
        this.noProduksi = noProduksi;
    }

    public DataProduksi(Integer noProduksi, Date tglProduksi, String jenisProduk, int jmlProduk, String idUser, int batchNo) {
        this.noProduksi = noProduksi;
        this.tglProduksi = tglProduksi;
        this.jenisProduk = jenisProduk;
        this.jmlProduk = jmlProduk;
        this.idUser = idUser;
        this.batchNo = batchNo;
    }

    public Integer getNoProduksi() {
        return noProduksi;
    }

    public void setNoProduksi(Integer noProduksi) {
        this.noProduksi = noProduksi;
    }

    public Date getTglProduksi() {
        return tglProduksi;
    }

    public void setTglProduksi(Date tglProduksi) {
        this.tglProduksi = tglProduksi;
    }

    public String getJenisProduk() {
        return jenisProduk;
    }

    public void setJenisProduk(String jenisProduk) {
        this.jenisProduk = jenisProduk;
    }

    public int getJmlProduk() {
        return jmlProduk;
    }

    public void setJmlProduk(int jmlProduk) {
        this.jmlProduk = jmlProduk;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noProduksi != null ? noProduksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataProduksi)) {
            return false;
        }
        DataProduksi other = (DataProduksi) object;
        if ((this.noProduksi == null && other.noProduksi != null) || (this.noProduksi != null && !this.noProduksi.equals(other.noProduksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kangen.model.DataProduksi[ noProduksi=" + noProduksi + " ]";
    }
    
}
