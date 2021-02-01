package com.tufusi.ext.demo;

/**
 * Created by LeoCheung on 2021/1/14.
 *
 * @description
 */
public class SampleStaticProxy {

    interface IService {
        void sayHello();
    }

    static class ConcreteService implements IService {

        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class ProxyService implements IService {

        private IService mService;

        public ProxyService(IService service) {
            mService = service;
        }

        @Override
        public void sayHello() {
            System.out.println("entering method");
            mService.sayHello();
            System.out.println("leaving method");
        }
    }

    public static void main(String[] args) {
        IService concreteService = new ConcreteService();
        ProxyService proxyService = new ProxyService(concreteService);
        proxyService.sayHello();
    }
} 