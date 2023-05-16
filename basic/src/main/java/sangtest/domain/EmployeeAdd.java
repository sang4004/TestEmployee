package sangtest.domain;

import java.util.*;
import lombok.*;
import sangtest.domain.*;
import sangtest.infra.AbstractEvent;

@Data
@ToString
public class EmployeeAdd extends AbstractEvent {

    private Long id;

    public EmployeeAdd(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdd() {
        super();
    }
}
