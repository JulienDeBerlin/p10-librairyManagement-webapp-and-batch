package com.berthoud.p7.webapp.clients;


import customersAndLoans.wsdl.*;
import org.springframework.beans.BeanUtils;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import p7.webapp.model.beans.Book;
import p7.webapp.model.beans.BookReference;
import p7.webapp.model.beans.Customer;
import p7.webapp.model.beans.Loan;

import java.util.HashSet;
import java.util.Set;

import static com.berthoud.p7.webapp.utils.Utils.convertXmlDateToLocal;


/**
 * This class consumes the webservices offered by the wsdl books.wsdl
 */
public class CustomersAndLoansClientWs extends WebServiceGatewaySupport {


    /**
     * This method is used to retrieve a customer, using a webservice.
     *
     * @param email    the email of the Customer
     * @param password the password of the Customer
     * @return a webservice {@link LoginCustomerRequest} object
     */
    public LoginCustomerResponse getCustomerWs(String email, String password) {
        LoginCustomerRequest request = new LoginCustomerRequest();
        request.setEmail(email);
        request.setPassword(password);
        return (LoginCustomerResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    /**
     * This method retrieves a customer, using a webservice. It maps then the result into a {@link Customer} object.
     *
     * @param email    the email of the Customer
     * @param password the password of the Customer
     * @return a {@link Customer} object
     */
    public Customer getCustomerMapped(String email, String password) {
        Customer customer = new Customer();
        CustomerWs customerWs = getCustomerWs(email, password).getCustomer();

        BeanUtils.copyProperties(customerWs, customer);
        customer.setDateExpirationMembership(convertXmlDateToLocal(customerWs.getDateExpirationMembership()));

        Set<Loan> loanSet = new HashSet<>();

        for (LoanWs loanWs : customerWs.getLoans()) {

            Loan loan = new Loan();
            BeanUtils.copyProperties(loanWs, loan);
            loan.setDateBegin(convertXmlDateToLocal(loanWs.getDateBegin()));
            loan.setDateEnd(convertXmlDateToLocal(loanWs.getDateEnd()));
            loan.setDateBack(convertXmlDateToLocal(loanWs.getDateBack()));

            Book book = new Book();
            BookWs bookWs = loanWs.getBook();

            BeanUtils.copyProperties(bookWs, book);

            BookReference bookReference = new BookReference();
            BeanUtils.copyProperties(bookWs.getBookReference(), bookReference);

            book.setBookReference(bookReference);
            loan.setBook(book);
            loanSet.add(loan);
        }

        customer.setLoans(loanSet);

        return customer;
    }

    /**
     * This method is used to extend a loan using a webservice.
     *
     * @param loanId the id of the Loan to be extended
     * @return a webservice {@link ExtendLoanResponse} object
     */
    public ExtendLoanResponse extendLoanWs(int loanId) {
        ExtendLoanRequest request = new ExtendLoanRequest();
        request.setLoanId(loanId);
        return (ExtendLoanResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }


    /**
     * This method is used to extend a loan using a webservice. It then maps the result into a {@link Loan} object.
     *
     * @param loanId the id of the Loan to be extended
     * @return a {@link Loan} object
     */
    public int extendLoanMapped(int loanId) {
        return extendLoanWs(loanId).getResultCode();
    }

}
