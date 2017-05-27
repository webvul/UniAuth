package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.Tenancy;
import com.dianrong.common.uniauth.server.data.entity.TenancyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenancyMapper {
  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int countByExample(TenancyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int deleteByExample(TenancyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int deleteByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int insert(Tenancy record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int insertSelective(Tenancy record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  List<Tenancy> selectByExample(TenancyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  Tenancy selectByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int updateByExampleSelective(@Param("record") Tenancy record,
      @Param("example") TenancyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int updateByExample(@Param("record") Tenancy record, @Param("example") TenancyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int updateByPrimaryKeySelective(Tenancy record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * tenancy
   *
   * @mbggenerated Tue Sep 27 12:31:53 CST 2016
   */
  int updateByPrimaryKey(Tenancy record);
}
