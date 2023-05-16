package sangtest.domain;

import java.util.*;
import lombok.*;
import sangtest.domain.*;
import sangtest.infra.AbstractEvent;

@Data
@ToString
public class DepartmentAdd extends AbstractEvent {

    private Long id;

    public DepartmentAdd(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdd() {
        super();
    }
}
