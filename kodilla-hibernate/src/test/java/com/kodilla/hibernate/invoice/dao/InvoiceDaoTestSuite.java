package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private ProductDao productDao;
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");
        Product product4 = new Product("product4");
        Product product5 = new Product("product5");
        Product product6 = new Product("product6");
        Product product7 = new Product("product7");
        Product product8 = new Product("product8");

        Item item1 = new Item(product1, new BigDecimal(34), 4);
        Item item2 = new Item(product2, new BigDecimal(156), 6);
        Item item3 = new Item(product3, new BigDecimal(324), 2);
        Item item4 = new Item(product4, new BigDecimal(73), 1);
        Item item5 = new Item(product5, new BigDecimal(894), 5);
        Item item6 = new Item(product6, new BigDecimal(83), 8);
        Item item7 = new Item(product7, new BigDecimal(54), 3);
        Item item8 = new Item(product8, new BigDecimal(122), 4);

        Invoice invoice1 = new Invoice("1234");
        Invoice invoice2 = new Invoice("4321");
        Invoice invoice3 = new Invoice("1243");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);
        invoice2.getItems().add(item6);
        invoice3.getItems().add(item7);
        invoice3.getItems().add(item8);

        //When

        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();

        //Then
        Assertions.assertNotEquals(0, invoice1Id);
        Assertions.assertNotEquals(0, invoice2Id);
        Assertions.assertNotEquals(0, invoice3Id);

        //CleanUp
        try {
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);
            invoiceDao.deleteById(invoice3Id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
