package App.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@ToString
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private String orderId;
    private Item item=new Item();
}
