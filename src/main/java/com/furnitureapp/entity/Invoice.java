package com.furnitureapp.entity;

import java.util.Date;

// Invoices will be generated and saved to a printable file.
public class Invoice {
    private int invoiceCode;
    private int customerCode;
    private int saleCode;
    private Date date;

    public Invoice(InvoiceBuilder invoiceBuilder){
        this.invoiceCode = invoiceBuilder.invoiceCode;
        this.customerCode = invoiceBuilder.customerCode;
        this.saleCode = invoiceBuilder.saleCode;
        this.date = invoiceBuilder.date;
    }

    public int getInvoiceCode() {
        return invoiceCode;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public int getSaleCode() {
        return saleCode;
    }

    public Date getDate() {
        return date;
    }

    public static class InvoiceBuilder{
        private int invoiceCode;
        private int customerCode;
        private int saleCode;
        private Date date;

        public InvoiceBuilder setInvoiceCode(int invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }

        public InvoiceBuilder setCustomerCode(int customerCode) {
            this.customerCode = customerCode;
            return this;
        }

        public InvoiceBuilder setSaleCode(int saleCode) {
            this.saleCode = saleCode;
            return this;
        }

        public InvoiceBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public InvoiceBuilder Copy(Invoice invoice){
            this.customerCode = invoice.customerCode;
            this.invoiceCode = invoice.invoiceCode;
            this.saleCode = invoice.saleCode;
            this.date = invoice.date;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }
    }

}
