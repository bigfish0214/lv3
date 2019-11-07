package com.lv3.cc.criteria.impl;

import com.lv3.cc.criteria.Criteria;
import com.lv3.cc.criteria.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for(Person person : persons) {
            if(person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
