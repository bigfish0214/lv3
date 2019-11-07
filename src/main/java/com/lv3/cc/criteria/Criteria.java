package com.lv3.cc.criteria;

import java.util.List;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
