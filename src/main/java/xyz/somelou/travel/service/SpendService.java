package xyz.somelou.travel.service;


import xyz.somelou.travel.entity.ItemSpend;
import xyz.somelou.travel.entity.TotalBudget;

import java.util.List;

/**
 * @author somelou
 * @date 2019-04-03
 */
public interface SpendService {

    void addBudget(TotalBudget totalBudget);

    void addItemSpend(ItemSpend itemSpend);

    List<ItemSpend> getAll();

    TotalBudget getTotalBudget();

}
