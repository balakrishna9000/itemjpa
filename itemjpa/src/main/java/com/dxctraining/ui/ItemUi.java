package com.dxctraining.ui;

import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.ItemNotFoundException;
import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ItemUi {
    @Autowired
    private IItemService service;


    @PostConstruct
    public void runUi(){
        try {
            Item item1 = new Item("balakrishna", 21);
            Item item2 = new Item("vamsi", 22);
            item1 = service.save(item1);
            item2 = service.save(item2);

            int id1 = item1.getId();
            Item fetched = service.findItemById(id1);
            System.out.println("fetcehd item =" + fetched.getName() + " " + fetched.getId());
        }catch (ItemNotFoundException e){
            e.printStackTrace();
        }

        catch (InvalidArgumentException e){
            e.printStackTrace();
        }
    }



}
