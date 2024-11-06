package io.tibetteixeira.structural.proxy.remoteresource;

import io.tibetteixeira.structural.proxy.remoteresource.service.Resource;
import io.tibetteixeira.structural.proxy.remoteresource.service.ResourceImpl;
import io.tibetteixeira.structural.proxy.remoteresource.service.ResourceProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class App {

    public static void main(String[] args) throws InterruptedException, IOException {
//        Resource resource = new ResourceImpl();
//        Resource resource = new ResourceProxy("Inv@lid");
        Resource resource = new ResourceProxy("T0k3n");

        final String menu = """
                This is your options:
                \t1 - Current date
                \t2 - Get resource's data
                \t0 - Exit
                What do you want?
                """;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;

        while (!exit) {
            System.out.println(menu);
            String option = buffer.readLine();
            System.out.println("\n\n");

            switch (option) {
                case "1":
                    System.out.println(new Date());
                    break;
                case "9":
                    System.out.println(resource.getData());
                    break;
                case "0":
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    exit = true;
            }
        }

    }
}
