/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.springbootstarter.unicenta.tickets;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tutnatha
 */
@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findById", query = "SELECT p FROM Products p WHERE p.id = :id"),
    @NamedQuery(name = "Products.findByReference", query = "SELECT p FROM Products p WHERE p.reference = :reference"),
    @NamedQuery(name = "Products.findByCode", query = "SELECT p FROM Products p WHERE p.code = :code"),
    @NamedQuery(name = "Products.findByCodetype", query = "SELECT p FROM Products p WHERE p.codetype = :codetype"),
    @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name"),
    @NamedQuery(name = "Products.findByPricebuy", query = "SELECT p FROM Products p WHERE p.pricebuy = :pricebuy"),
    @NamedQuery(name = "Products.findByPricesell", query = "SELECT p FROM Products p WHERE p.pricesell = :pricesell"),
    @NamedQuery(name = "Products.findByStockcost", query = "SELECT p FROM Products p WHERE p.stockcost = :stockcost"),
    @NamedQuery(name = "Products.findByStockvolume", query = "SELECT p FROM Products p WHERE p.stockvolume = :stockvolume"),
    @NamedQuery(name = "Products.findByIscom", query = "SELECT p FROM Products p WHERE p.iscom = :iscom"),
    @NamedQuery(name = "Products.findByIsscale", query = "SELECT p FROM Products p WHERE p.isscale = :isscale"),
    @NamedQuery(name = "Products.findByIsconstant", query = "SELECT p FROM Products p WHERE p.isconstant = :isconstant"),
    @NamedQuery(name = "Products.findByPrintkb", query = "SELECT p FROM Products p WHERE p.printkb = :printkb"),
    @NamedQuery(name = "Products.findBySendstatus", query = "SELECT p FROM Products p WHERE p.sendstatus = :sendstatus"),
    @NamedQuery(name = "Products.findByIsservice", query = "SELECT p FROM Products p WHERE p.isservice = :isservice"),
    @NamedQuery(name = "Products.findByDisplay", query = "SELECT p FROM Products p WHERE p.display = :display"),
    @NamedQuery(name = "Products.findByIsvprice", query = "SELECT p FROM Products p WHERE p.isvprice = :isvprice"),
    @NamedQuery(name = "Products.findByIsverpatrib", query = "SELECT p FROM Products p WHERE p.isverpatrib = :isverpatrib"),
    @NamedQuery(name = "Products.findByTexttip", query = "SELECT p FROM Products p WHERE p.texttip = :texttip"),
    @NamedQuery(name = "Products.findByWarranty", query = "SELECT p FROM Products p WHERE p.warranty = :warranty"),
    @NamedQuery(name = "Products.findByStockunits", query = "SELECT p FROM Products p WHERE p.stockunits = :stockunits"),
    @NamedQuery(name = "Products.findByPrintto", query = "SELECT p FROM Products p WHERE p.printto = :printto"),
    @NamedQuery(name = "Products.findBySupplier", query = "SELECT p FROM Products p WHERE p.supplier = :supplier"),
    @NamedQuery(name = "Products.findByUom", query = "SELECT p FROM Products p WHERE p.uom = :uom"),
    @NamedQuery(name = "Products.findByMemodate", query = "SELECT p FROM Products p WHERE p.memodate = :memodate")})
public class Products implements Serializable {

    @Lob
    @Column(name = "image")
    private byte[] image;
    @Lob
    @Column(name = "attributes")
    private byte[] attributes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Stocklevel> stocklevelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Stockdiary> stockdiaryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductsBundle> productsBundleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productBundle")
    private List<ProductsBundle> productsBundleList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<ProductsCom> productsComList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product2")
    private List<ProductsCom> productsComList1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "products")
    private ProductsCat productsCat;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "reference")
    private String reference;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Column(name = "codetype")
    private String codetype;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "pricebuy")
    private double pricebuy;
    @Basic(optional = false)
    @Column(name = "pricesell")
    private double pricesell;
    @Basic(optional = false)
    @Column(name = "stockcost")
    private double stockcost;
    @Basic(optional = false)
    @Column(name = "stockvolume")
    private double stockvolume;
    @Basic(optional = false)
    @Column(name = "iscom")
    private boolean iscom;
    @Basic(optional = false)
    @Column(name = "isscale")
    private boolean isscale;
    @Basic(optional = false)
    @Column(name = "isconstant")
    private boolean isconstant;
    @Basic(optional = false)
    @Column(name = "printkb")
    private boolean printkb;
    @Basic(optional = false)
    @Column(name = "sendstatus")
    private boolean sendstatus;
    @Basic(optional = false)
    @Column(name = "isservice")
    private boolean isservice;
    @Column(name = "display")
    private String display;
    @Basic(optional = false)
    @Column(name = "isvprice")
    private short isvprice;
    @Basic(optional = false)
    @Column(name = "isverpatrib")
    private short isverpatrib;
    @Column(name = "texttip")
    private String texttip;
    @Basic(optional = false)
    @Column(name = "warranty")
    private short warranty;
    @Basic(optional = false)
    @Column(name = "stockunits")
    private double stockunits;
    @Column(name = "printto")
    private String printto;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "uom")
    private String uom;
    @Column(name = "memodate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date memodate;
    @OneToMany(mappedBy = "product")
    private List<Ticketlines> ticketlinesList;
    @JoinColumn(name = "attributeset_id", referencedColumnName = "id")
    @ManyToOne
    private Attributeset attributesetId;
    @JoinColumn(name = "category", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Categories category;
    @JoinColumn(name = "taxcat", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Taxcategories taxcat;

    public Products() {
    }

    public Products(String id) {
        this.id = id;
    }

    public Products(String id, String reference, String code, String name, double pricebuy, double pricesell, double stockcost, double stockvolume, boolean iscom, boolean isscale, boolean isconstant, boolean printkb, boolean sendstatus, boolean isservice, short isvprice, short isverpatrib, short warranty, double stockunits) {
        this.id = id;
        this.reference = reference;
        this.code = code;
        this.name = name;
        this.pricebuy = pricebuy;
        this.pricesell = pricesell;
        this.stockcost = stockcost;
        this.stockvolume = stockvolume;
        this.iscom = iscom;
        this.isscale = isscale;
        this.isconstant = isconstant;
        this.printkb = printkb;
        this.sendstatus = sendstatus;
        this.isservice = isservice;
        this.isvprice = isvprice;
        this.isverpatrib = isverpatrib;
        this.warranty = warranty;
        this.stockunits = stockunits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricebuy() {
        return pricebuy;
    }

    public void setPricebuy(double pricebuy) {
        this.pricebuy = pricebuy;
    }

    public double getPricesell() {
        return pricesell;
    }

    public void setPricesell(double pricesell) {
        this.pricesell = pricesell;
    }

    public double getStockcost() {
        return stockcost;
    }

    public void setStockcost(double stockcost) {
        this.stockcost = stockcost;
    }

    public double getStockvolume() {
        return stockvolume;
    }

    public void setStockvolume(double stockvolume) {
        this.stockvolume = stockvolume;
    }


    public boolean getIscom() {
        return iscom;
    }

    public void setIscom(boolean iscom) {
        this.iscom = iscom;
    }

    public boolean getIsscale() {
        return isscale;
    }

    public void setIsscale(boolean isscale) {
        this.isscale = isscale;
    }

    public boolean getIsconstant() {
        return isconstant;
    }

    public void setIsconstant(boolean isconstant) {
        this.isconstant = isconstant;
    }

    public boolean getPrintkb() {
        return printkb;
    }

    public void setPrintkb(boolean printkb) {
        this.printkb = printkb;
    }

    public boolean getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(boolean sendstatus) {
        this.sendstatus = sendstatus;
    }

    public boolean getIsservice() {
        return isservice;
    }

    public void setIsservice(boolean isservice) {
        this.isservice = isservice;
    }


    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public short getIsvprice() {
        return isvprice;
    }

    public void setIsvprice(short isvprice) {
        this.isvprice = isvprice;
    }

    public short getIsverpatrib() {
        return isverpatrib;
    }

    public void setIsverpatrib(short isverpatrib) {
        this.isverpatrib = isverpatrib;
    }

    public String getTexttip() {
        return texttip;
    }

    public void setTexttip(String texttip) {
        this.texttip = texttip;
    }

    public short getWarranty() {
        return warranty;
    }

    public void setWarranty(short warranty) {
        this.warranty = warranty;
    }

    public double getStockunits() {
        return stockunits;
    }

    public void setStockunits(double stockunits) {
        this.stockunits = stockunits;
    }

    public String getPrintto() {
        return printto;
    }

    public void setPrintto(String printto) {
        this.printto = printto;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Date getMemodate() {
        return memodate;
    }

    public void setMemodate(Date memodate) {
        this.memodate = memodate;
    }

    @XmlTransient
    public List<Ticketlines> getTicketlinesList() {
        return ticketlinesList;
    }

    public void setTicketlinesList(List<Ticketlines> ticketlinesList) {
        this.ticketlinesList = ticketlinesList;
    }

    public Attributeset getAttributesetId() {
        return attributesetId;
    }

    public void setAttributesetId(Attributeset attributesetId) {
        this.attributesetId = attributesetId;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public Taxcategories getTaxcat() {
        return taxcat;
    }

    public void setTaxcat(Taxcategories taxcat) {
        this.taxcat = taxcat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.course.springbootstarter.cahayaberas.Products[ id=" + id + " ]";
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getAttributes() {
        return attributes;
    }

    public void setAttributes(byte[] attributes) {
        this.attributes = attributes;
    }

    @XmlTransient
    public List<Stocklevel> getStocklevelList() {
        return stocklevelList;
    }

    public void setStocklevelList(List<Stocklevel> stocklevelList) {
        this.stocklevelList = stocklevelList;
    }

    @XmlTransient
    public List<Stockdiary> getStockdiaryList() {
        return stockdiaryList;
    }

    public void setStockdiaryList(List<Stockdiary> stockdiaryList) {
        this.stockdiaryList = stockdiaryList;
    }

    @XmlTransient
    public List<ProductsBundle> getProductsBundleList() {
        return productsBundleList;
    }

    public void setProductsBundleList(List<ProductsBundle> productsBundleList) {
        this.productsBundleList = productsBundleList;
    }

    @XmlTransient
    public List<ProductsBundle> getProductsBundleList1() {
        return productsBundleList1;
    }

    public void setProductsBundleList1(List<ProductsBundle> productsBundleList1) {
        this.productsBundleList1 = productsBundleList1;
    }

    @XmlTransient
    public List<ProductsCom> getProductsComList() {
        return productsComList;
    }

    public void setProductsComList(List<ProductsCom> productsComList) {
        this.productsComList = productsComList;
    }

    @XmlTransient
    public List<ProductsCom> getProductsComList1() {
        return productsComList1;
    }

    public void setProductsComList1(List<ProductsCom> productsComList1) {
        this.productsComList1 = productsComList1;
    }

    public ProductsCat getProductsCat() {
        return productsCat;
    }

    public void setProductsCat(ProductsCat productsCat) {
        this.productsCat = productsCat;
    }
    
}
