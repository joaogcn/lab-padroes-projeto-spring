package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.service.Service;

public class ServiceImpl implements Service {
    @Override
    public void performOperation() {
        System.out.println("Fazendo operacão em ServiceImpl");
    }
}