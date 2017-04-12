package com.rusamaha.knittyband.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by rusamaha on 4/7/17.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String productImgPath;
    private String description;
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Size> size;
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Color> color;
    private BigDecimal price;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

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

    public String getProductImgPath() {
        return productImgPath;
    }

    public void setProductImgPath(String productImgPath) {
        this.productImgPath = productImgPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Size> getSize() {
        return size;
    }

    public void setSize(List<Size> size) {
        this.size = size;
    }

    public List<Color> getColor() {
        return color;
    }

    public void setColor(List<Color> color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
