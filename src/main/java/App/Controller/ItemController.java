package App.Controller;

import App.Domain.Item;
import App.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

//@PathVariable("id")
//    @RequestMapping(value = "/item/{id}",method = RequestMethod.GET)
    @GetMapping("/item/{id}")
    public Item queryItemById(@PathVariable("id") Long id){
        return itemService.queryItemById(id);
    }
}
