package poms.finance.service;

import poms.center.entity.Invoice;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/7.
 */
public interface IInvoiceService {
    int register(Invoice invoice);

    int grant(Invoice invoice);

    int returnService(Invoice invoice);

    List<Invoice> query(int page);
}
