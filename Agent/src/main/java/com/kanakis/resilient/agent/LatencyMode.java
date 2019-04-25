package com.kanakis.resilient.agent;

import javassist.CannotCompileException;
import javassist.CtMethod;

public class LatencyMode implements OperationMode {
    @Override
    public CtMethod generateCode(CtMethod method, TransformProperties properties) throws CannotCompileException {
        String assaultCode = "try { Thread.sleep(" + properties.getLatency() + "l);} catch (InterruptedException e) {}";
        method.insertAfter(assaultCode);

        return method;
    }
}
