package com.tactfactory.dp.singleton.second;

public class Application {
    public static void main(String[] args) throws InvalidConfigFileException {
        final AppConfiguration config = AppConfiguration.getInstance();

        final int port = config.getPort();
        final String host = config.getHost();

        System.out.println("Le serveur sera executé sur " + host + ':' + port);
    }
}
