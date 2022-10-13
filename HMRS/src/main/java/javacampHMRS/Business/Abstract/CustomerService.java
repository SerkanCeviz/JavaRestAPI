package javacampHMRS.Business.Abstract;


import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Customer_;

public interface CustomerService {

    DataResult<Customer_> getAll();
    Result addCustomer(Customer_ customer);
    Result updateCustomer(int customerId, Customer_ customer);
    Result deleteCustomer(int customerId);

}
