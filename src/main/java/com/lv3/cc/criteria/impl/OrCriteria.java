package com.lv3.cc.criteria.impl;

import com.lv3.cc.criteria.Criteria;
import com.lv3.cc.criteria.Person;

import java.util.List;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);
        for(Person person : otherCriteriaPersons) {
            if(!firstCriteriaPersons.contains(person)) {
                firstCriteriaPersons.add(person);
            }
        }
        return firstCriteriaPersons;
    }
}
