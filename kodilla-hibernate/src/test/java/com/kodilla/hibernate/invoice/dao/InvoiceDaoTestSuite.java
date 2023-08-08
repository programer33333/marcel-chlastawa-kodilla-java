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

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("product1");
        productDao.save(product);

        Item item = new Item(product, new BigDecimal(34), 4);

        Invoice invoice = new Invoice("1234");
        item.setInvoice(invoice);
        invoice.getItems().add(item);

        //When
        invoiceDao.save(invoice);

        int invoiceId = invoice.getId();

        //Then
        Assertions.assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            invoiceDao.delete(invoice);
            productDao.delete(product);
            itemDao.delete(item);
        } catch (Exception e) {
            //do nothing
        }
    }
}
