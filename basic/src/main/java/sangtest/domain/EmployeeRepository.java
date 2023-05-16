package sangtest.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sangtest.domain.*;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository
    extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByUserId(String userId);
}
