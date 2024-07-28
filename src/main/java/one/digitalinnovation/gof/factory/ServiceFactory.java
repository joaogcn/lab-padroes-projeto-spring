package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.service.Service;
import one.digitalinnovation.gof.service.impl.ServiceImpl;

public class ServiceFactory {
    public static Service getService() {
        return new ServiceImpl()
        ;
    }
}