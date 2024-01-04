package com.exercise.Services.Impl;

import com.exercise.Services.IServicioA;
import com.exercise.Services.IServicioB;

public class ServicioBImpl implements IServicioB {

    private IServicioA servicioA;
    @Override
    public IServicioA getServicioA() {
        return servicioA;
    }

    @Override
    public void setServicioA(IServicioA servicioA) {
        this.servicioA=servicioA;
    }

    @Override
    public int multiplicarSuma(int a, int b, int multiplicador) {
        return servicioA.sumar(a,b)*multiplicador;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a*b;
    }
}
