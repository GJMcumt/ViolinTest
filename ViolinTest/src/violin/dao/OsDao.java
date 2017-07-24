package violin.dao;

import org.apache.ibatis.annotations.Select;

import violin.domain.Order_status;

import static violin.util.common.Constants.OSTABLE;

public interface OsDao {
@Select("select status from "+OSTABLE+" where id=#{id}")
Order_status selectOs(Integer id);
}
