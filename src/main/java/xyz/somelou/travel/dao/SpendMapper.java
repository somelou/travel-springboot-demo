package xyz.somelou.travel.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.somelou.travel.entity.ItemSpend;
import xyz.somelou.travel.entity.TotalBudget;

import java.util.List;

/**
 * @author somelou
 * @date 2019-04-03
 */
@Mapper
public interface SpendMapper {

    void addTotalBudget(TotalBudget budget);

    void addItemSpend(ItemSpend itemSpend);

    List<ItemSpend> getItemSpendList();

    TotalBudget getTotalBudget();
}
