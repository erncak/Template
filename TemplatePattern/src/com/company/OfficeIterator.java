package com.company;

import java.util.ArrayList;

public class OfficeIterator implements Iterator{
    int index;
    OfficeComputer[] officeComputers;

    @Override
    public boolean hasNext() {

        if(index < officeComputers.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return officeComputers[index++];
        }
        return null;
    }
}

