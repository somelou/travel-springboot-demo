package xyz.somelou.travel.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 总预算
 * @author somelou
 * @date 2019-04-03
 */
@Data
@Entity
@Table(name = "total_spend")
public class TotalBudget {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "budget")
    private Float budget;
}
