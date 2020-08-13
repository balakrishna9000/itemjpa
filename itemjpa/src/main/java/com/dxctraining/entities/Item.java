package com.dxctraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")//table name
public class Item {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Item(String name, int age) {
        this.name = name;
        this.id=id;
    }
    public Item() {
    	this("",0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Item that = (Item) obj;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
