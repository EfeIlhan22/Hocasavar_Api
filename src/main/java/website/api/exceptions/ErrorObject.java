package website.api.exceptions;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorObject {
    private Integer statusCode;
    private String message;
    private Date timeStamp;

}
