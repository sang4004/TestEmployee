package sangtest.domain;

import java.util.*;
import lombok.*;
import sangtest.domain.*;
import sangtest.infra.AbstractEvent;

@Data
@ToString
public class RankAdd extends AbstractEvent {

    private Long id;

    public RankAdd(Rank aggregate) {
        super(aggregate);
    }

    public RankAdd() {
        super();
    }
}
