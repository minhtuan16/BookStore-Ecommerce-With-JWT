package com.example.demo.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.demo.model.dto.ChartDTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@SqlResultSetMappings(
        value = {
                @SqlResultSetMapping(
                        name = "chartBrandDTO",
                        classes = @ConstructorResult(
                                targetClass = ChartDTO.class,
                                columns = {
                                        @ColumnResult(name = "label",type = String.class),
                                        @ColumnResult(name = "value",type = Integer.class)
                                }
                        )
                )
        }
)
@NamedNativeQuery(
        name = "getProductOrderBrands",
        resultSetMapping = "chartBrandDTO",
        query = "select b.name as label, count(o.quantity) as value  from brand b " +
                "inner join product p on p.brand_id = b.id " +
                "inner join orders o on p.id = o.product_id " +
                "where o.status = 3 " +
                "group by b.id"
)

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false,unique = true)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "status",columnDefinition = "BOOLEAN")
    private boolean status;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "modified_at")
    private Timestamp modifiedAt;
    @OneToMany(mappedBy = "brand")
    @JsonIgnore
    private List<Product> products;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
    
    
}
