package com.kanakis.resilient.perses.agents;

public interface TransformerServiceMBean {
    /**
     * Transforms the target class name
	 * @param className The binary name of the target class
	 * @param methodName  The name of the method to transform
	 * @param attackMode      The type of attack to be injected
	 * */
    void transformClass(String className, String methodName, String attackMode);
}
