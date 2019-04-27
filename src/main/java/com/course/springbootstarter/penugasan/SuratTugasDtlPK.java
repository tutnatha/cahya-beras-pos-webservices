package com.course.springbootstarter.penugasan;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the surat_tugas_dtl database table.
 * 
 */
@Embeddable
public class SuratTugasDtlPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="nomor_surat")
	private String nomorSurat;

	@Column(name="nip", insertable=false, updatable=false)
	private String nip;

	@Temporal(TemporalType.DATE)
	@Column(name="tgl_pemantauan")
	private java.util.Date tglPemantauan;

	public SuratTugasDtlPK() {
	}
	public String getNomorSurat() {
		return this.nomorSurat;
	}
	public void setNomorSurat(String nomorSurat) {
		this.nomorSurat = nomorSurat;
	}
	public String getNip() {
		return this.nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public java.util.Date getTglPemantauan() {
		return this.tglPemantauan;
	}
	public void setTglPemantauan(java.util.Date tglPemantauan) {
		this.tglPemantauan = tglPemantauan;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SuratTugasDtlPK)) {
			return false;
		}
		SuratTugasDtlPK castOther = (SuratTugasDtlPK)other;
		return 
			this.nomorSurat.equals(castOther.nomorSurat)
			&& this.nip.equals(castOther.nip)
			&& this.tglPemantauan.equals(castOther.tglPemantauan);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nomorSurat.hashCode();
		hash = hash * prime + this.nip.hashCode();
		hash = hash * prime + this.tglPemantauan.hashCode();
		
		return hash;
	}
}