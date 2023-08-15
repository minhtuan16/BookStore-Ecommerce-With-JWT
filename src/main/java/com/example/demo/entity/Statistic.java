package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.example.demo.model.dto.StatisticDTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@SqlResultSetMappings(
        value = {
                @SqlResultSetMapping(
                        name = "statisticDTO",
                        classes = @ConstructorResult(
                                targetClass = StatisticDTO.class,
                                columns = {
                                        @ColumnResult(name = "sales",type = Long.class),
                                        @ColumnResult(name = "profit",type = Long.class),
                                        @ColumnResult(name = "quantity",type = Integer.class),
                                        @ColumnResult(name = "createdAt",type = String.class)
                                }
                        )
                )
        }
)

@NamedNativeQuery(
        name = "getStatistic30Day",
        resultSetMapping = "statisticDTO",
        query = "SELECT s.sales, s.profit, s.quantity, date_format(s.created_at,'%Y-%m-%d') as createdAt FROM statistic s WHERE date_format(s.created_at,'%Y-%m-%d') BETWEEN DATE_SUB(NOW(), INTERVAL 30 DAY) AND NOW() ORDER BY createdAt ASC "
)
@NamedNativeQuery(
        name = "getStatisticDayByDay",
        resultSetMapping = "statisticDTO",
        query = "SELECT s.sales, s.profit, s.quantity, date_format(s.created_at,'%Y-%m-%d') as createdAt FROM statistic s WHERE date_format(s.created_at,'%Y-%m-%d') >=?1 AND date_format(s.created_at,'%Y-%m-%d') <=?2 ORDER BY createdAt ASC "
)
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "statistic")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sales")
    private long sales;
    @Column(name = "profit")
    private long profit;
    @Column(name = "quantity")
    private int quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    @Column(name = "created_at")
    private Timestamp createdAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSales() {
		return sales;
	}
	public void setSales(long sales) {
		this.sales = sales;
	}
	public long getProfit() {
		return profit;
	}
	public void setProfit(long profit) {
		this.profit = profit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
    
    
}
