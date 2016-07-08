package com.rainbow.entity;

import com.sun.mail.imap.protocol.Item;

import java.util.List;

/**
 * Created by rainbow on 2016/6/23.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class ItemsQueryVo {
    private ItemsCustomer itemsCustomer;
private List<ItemsCustomer> itemsList;
    public ItemsCustomer getItemsCustomer() {
        return itemsCustomer;
    }

    public void setItemsCustomer(ItemsCustomer itemsCustomer) {
        this.itemsCustomer = itemsCustomer;
    }

    public List<ItemsCustomer> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<ItemsCustomer> itemsList) {
        this.itemsList = itemsList;
    }
}
