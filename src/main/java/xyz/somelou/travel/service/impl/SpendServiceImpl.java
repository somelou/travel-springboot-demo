package xyz.somelou.travel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.somelou.travel.dao.SpendMapper;
import xyz.somelou.travel.entity.ItemSpend;
import xyz.somelou.travel.entity.TotalBudget;
import xyz.somelou.travel.service.SpendService;

import java.util.List;

/**
 * @author somelou
 * @date 2019-04-03
 */
@Service
public class SpendServiceImpl implements SpendService {

    @Autowired
    SpendMapper spendMapper;

    @Override
    public void addBudget(TotalBudget totalBudget) {
        spendMapper.addTotalBudget(totalBudget);
    }

    @Override
    public void addItemSpend(ItemSpend itemSpend) {
        spendMapper.addItemSpend(itemSpend);
    }

    @Override
    public List<ItemSpend> getAll() {
        return spendMapper.getItemSpendList();
    }

    @Override
    public TotalBudget getTotalBudget() {
        return spendMapper.getTotalBudget();
    }
}
