package thiagocrm.crm.leads;

import thiagocrm.crm.products.Product;

import java.util.LinkedList;

public class Lead{
    private Contact contact;
    private int leadId;
    private String leadName;
    private LinkedList<Product> products;
}
