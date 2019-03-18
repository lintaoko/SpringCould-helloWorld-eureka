package App.Service;


import App.Domain.Item;
import App.Domain.Order;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
//构造假数据
public class ItemService {
    private static final Map<Long, Item> MAP=new HashMap<Long,Item>();
    static {
        MAP.put(1L,new Item(1L,"商品标题1","htttp://img1","商品描述1",1000L));
        MAP.put(2L,new Item(2L,"商品标题2","htttp://img2","商品描述2",2000L));
        MAP.put(3L,new Item(3L,"商品标题3","htttp://img3","商品描述3",3000L));
        MAP.put(4L,new Item(4L,"商品标题4","htttp://img4","商品描述4",4000L));
        MAP.put(5L,new Item(5L,"商品标题5","htttp://img5","商品描述5",5000L));
        MAP.put(6L,new Item(6L,"商品标题6","htttp://img6","商品描述6",6000L));
        MAP.put(7L,new Item(7L,"商品标题7","htttp://img7","商品描述7",7000L));
        MAP.put(8L,new Item(8L,"商品标题8","htttp://img8","商品描述8",8000L));
    }

    public Item queryItemById(Long id){
        return MAP.get(id);
    }
}
