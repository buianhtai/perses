package com.kanakis.resilient.agent;

import javassist.CannotCompileException;
import javassist.CtMethod;

public class FaultMode implements OperationMode {
    @Override
    public CtMethod generateCode(CtMethod method, TransformProperties properties) throws CannotCompileException {
        String assaultCode = "if(true) throw new OutOfMemoryError(\"This is an injected exception by Perses\");";
        method.insertAfter(assaultCode);

        return method;
    }
}
