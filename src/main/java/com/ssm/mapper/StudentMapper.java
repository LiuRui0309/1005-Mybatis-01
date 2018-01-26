package com.ssm.mapper;

import com.ssm.domain.Student;
import com.ssm.page.PageBean;

import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 18/1/26.
 */
/*Stdent操作的对外接口声明
* 具体实现见Student.xml*/
public interface StudentMapper {
    /**
     * 查询所有学生列表
     * 1.方法名对应Student.xml中的id属性
     * 2.方法参数对应Student.xml中的parameterType属性
     * 3.方法返回值对应Student.xml中的resultType属性
     * @return
     */
    List<Student> selectAll();

    /**
     * 分页查询
     * @param pageBean 包含分页信息对象
     * @return
     */
    List<Student> pageSelect(PageBean<Student> pageBean);

    /**
     * 获取学生表总条数
     * @return
     */
    int getTotalRecord(PageBean<Student> pageBean);
}
