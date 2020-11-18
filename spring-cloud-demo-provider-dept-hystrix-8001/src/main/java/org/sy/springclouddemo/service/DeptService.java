package org.sy.springclouddemo.service;

import org.sy.springclouddemo.entities.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();

}
