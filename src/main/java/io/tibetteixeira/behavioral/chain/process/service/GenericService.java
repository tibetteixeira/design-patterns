package io.tibetteixeira.behavioral.chain.process.service;

import io.tibetteixeira.behavioral.chain.process.step.ProcessStep;

public class GenericService {

    public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
        try {
            ProcessContext result = startProcess.execute(initialContext);
            return result.getProcessResult();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
