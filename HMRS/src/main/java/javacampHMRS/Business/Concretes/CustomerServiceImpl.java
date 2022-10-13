package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.CustomerService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.ErrorDataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.CustomerRepository;
import javacampHMRS.Entity.Concretes.Customer_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    @Override
    public DataResult<Customer_> getAll() {
        try {
           return new SuccesDataResult(customerRepository.findAll());
        }
        catch (Exception e){
            return new ErrorDataResult("İşlem Başarısız");
        }
    }

    @Override
    public Result addCustomer(Customer_ customer) {
        return new SuccesDataResult(customerRepository.save(customer));
    }

    @Override
    public Result updateCustomer(int customerId, Customer_ customer) {
        Customer_ existCustomer = customerRepository.findByCustomerId(customerId);
        existCustomer.setAddress(customer.getAddress());
        existCustomer.setCity(customer.getCity());
        existCustomer.setCountry(customer.getCountry());
        existCustomer.setFax(customer.getFax());
        existCustomer.setCompanyName(customer.getCompanyName());
        existCustomer.setContact_title(customer.getContact_title());
        existCustomer.setContactName(customer.getContactName());
        existCustomer.setHomePage(customer.getHomePage());
        existCustomer.setPhone(customer.getPhone());
        existCustomer.setRegion(existCustomer.getRegion());
        return new SuccesDataResult(customerRepository.save(existCustomer));
    }

    @Override
    public Result deleteCustomer(int customerId) {
        return new SuccesDataResult(customerRepository.deleteById(customerId));
    }

}
