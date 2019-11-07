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
public class CriteriaFemale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for(Person person : persons) {
            if(person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
