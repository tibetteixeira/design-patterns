package io.tibetteixeira.structural.proxy.remoteresource.service;

import static java.util.Objects.isNull;
import static org.apache.commons.lang3.BooleanUtils.isFalse;

public class ResourceProxy implements Resource {

    private Resource resource;
    private final String validToken = "T0k3n";
    private final String tokenProvided;

    public ResourceProxy(String tokenProvided) {
        this.tokenProvided = tokenProvided;
    }

    @Override
    public String getData() {
        if (isFalse(tokenProvided.equals(validToken))) {
            return "Invalid token";
        }

        if (isNull(resource)) {
            try {
                resource = new ResourceImpl();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return resource.getData();
    }

}
