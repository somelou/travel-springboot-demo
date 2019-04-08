package xyz.somelou.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.somelou.travel.entity.ItemSpend;
import xyz.somelou.travel.entity.TotalBudget;
import xyz.somelou.travel.service.SpendService;

import java.util.List;
import java.util.Map;

/**
 * @author somelou
 * @date 2019-04-03
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/api/trip")
public class SpendController {

    @Autowired
    private SpendService spendService;

    @RequestMapping(value = "/add/budget")
    public ModelMap addBudget(@RequestBody Map<String,Object> param){
        ModelMap result=new ModelMap();
        TotalBudget totalBudget=new TotalBudget();
        totalBudget.setBudget(Float.valueOf(param.get("budget").toString()));
        spendService.addBudget(totalBudget);
        result.addAttribute("msg","success");
        return result;
    }

    @RequestMapping(value = "/add/spend")
    public ModelMap addItemSpend(@RequestBody Map<String,Object> param){
        ModelMap result=new ModelMap();
        ItemSpend itemSpend=new ItemSpend();
        itemSpend.setSpendMatter("支出");
        itemSpend.setSpend(Float.valueOf(param.get("spend").toString()));
        spendService.addItemSpend(itemSpend);
        result.addAttribute("msg","success");
        return result;
    }

    @RequestMapping(value = "/get/budget")
    public ModelMap getBudget(){
        ModelMap result=new ModelMap();
        Float budget=spendService.getTotalBudget().getBudget();
        result.addAttribute("budget",budget);
        return result;
    }

    @RequestMapping(value = "/get/spend")
    public ModelMap getSpend(){
        Float haveSpend= Float.valueOf(0);
        List<ItemSpend> list=spendService.getAll();
        for(ItemSpend itemSpend:list){
            haveSpend+=itemSpend.getSpend();
        }
        return new ModelMap().addAttribute("spend",haveSpend);
    }
}
