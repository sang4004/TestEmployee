package sangtest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUser {

    private String name;

    private String address;

    private String phoneNumber;
}
