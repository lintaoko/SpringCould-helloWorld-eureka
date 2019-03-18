package App.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@ToString
@AllArgsConstructor
@NoArgsConstructor
//商品实体
public class Item {
    private Long id;
    private String title;
    private String pic;
    private String desc;
    private Long price;
}
