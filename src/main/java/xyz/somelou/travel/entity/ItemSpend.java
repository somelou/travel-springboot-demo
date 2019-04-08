package xyz.somelou.travel.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author somelou
 * @date 2019-04-03
 */
@Data
@Entity
@Table(name = "item_spend")
public class ItemSpend {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "matter")
    private String spendMatter;

    @Column(name = "spend")
    private Float spend;
}
