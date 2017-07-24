package violin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;

import violin.domain.Order;

import violin.dynaSqlProvider.OrderDynaSqlProvider;


import static violin.util.common.Constants.ORDERTABLE;

public interface OrderDao {
//动态添加订单
	@SelectProvider(type=OrderDynaSqlProvider.class,method="insertOrder")
	void saveOrder(Order order);

//查询订单
	@Select("select * from "+ORDERTABLE+"")
	List<Order> selectOrder();
	
//查找Order_status=0的订单信息
	@Select("select * from "+ORDERTABLE+" where order_status=0 ")
	List<Order> selectOrder0();

//动态更新订单
	@SelectProvider(type=OrderDynaSqlProvider.class,method="updateOrder")
	void update(Order order);	
//更新订单状态
	@Update("update "+ORDERTABLE+" set order_status=0")
	void updateOrder_status();
//更改订单状态
	@Update("update "+ORDERTABLE+" set order_status=3")
	void updateOrder_status3();
	@Update("update "+ORDERTABLE+" set order_status=1")
	void updateOrder_status1();

//根据订单编号删除订单里的信息
	@Delete("delete from "+ORDERTABLE+" where order_sn=#{order_sn}")
	void deleteOrder(String order_sn);
//根据订单号查询订单
	@Select("select * from "+ORDERTABLE+" where order_sn=#{order_sn}")
		@Results({
			@Result(id=true,column="id",property="id"),
			@Result(column="order_sn",property="order_sn"),
			@Result(column="user_id",property="user_id"),
			@Result(column="address",property="address"),
			@Result(column="order_time",property="order_time"),
			@Result(column="id",property="order_status",
					one=@One(
							select="violin.dao.OsDao.selectOs",
							fetchType=FetchType.EAGER))
			
		})
	Order selectOrderByOrder_sn(String order_sn);
}
