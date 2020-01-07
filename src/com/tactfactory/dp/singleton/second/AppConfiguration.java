package com.tactfactory.dp.singleton.second;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppConfiguration {
    private static final String PARAM_SERVER = "server.port";

    private static final Object PARAM_HOST = "server.host";

    private static final String CONFIG_SEPARATOR = "=";

    private static final String CONFIG_FILE = "application.properties";

    private static volatile AppConfiguration instance;

    /** The store of configuration values. */
    private final Map<String, String> config = new HashMap<>();

    /** Private constructor => DP singleton. */
    private AppConfiguration() throws InvalidConfigFileException {
        this.readConfiguration();
    }

    /** @return Returns the unique instance of {@link AppConfiguration}. */
    public static AppConfiguration getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    try {
                        instance = new AppConfiguration();
                    } catch (InvalidConfigFileException e) {
                        e.printStackTrace();
                        System.exit(-1);
                    }
                }
            }
        }

        return instance;
    }

    /** Reads the application.properties file. */
    private void readConfiguration() throws InvalidConfigFileException {
        /*
        {
            BufferedReader bf = null;

            // Ouverture du fichier avec un try de base
            try {
                bf = new BufferedReader(new FileReader(new File("application.properties")));
                // Processes
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (bf != null) {
                    try {
                        bf.close();
                    } catch (IOException e) {
                    }
                }
            }
        }

        {
            // Avec un try-resource
            try (final BufferedReader bf = new BufferedReader(new FileReader(new File("application.properties")))) {
                // Processes.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */

        try (final BufferedReader bf = new BufferedReader(new FileReader(new File(CONFIG_FILE)))) {
            String line;

            while ((line = bf.readLine()) != null) {
                line = line.trim();

                if (!line.isEmpty()) {
                    final String[] split = line.split(CONFIG_SEPARATOR);

                    if (split.length == 2) {
                        final String key = split[0];
                        final String value = split[0];

                        // Store.
                        config.put(key, value);
                    } else {
                        throw new InvalidConfigFileException();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getPort() {
        final int res;

        if (this.config.containsKey(PARAM_SERVER)) {
            res = Integer.parseInt(this.config.get(PARAM_SERVER));
        } else {
            res = 0;
        }

        return res;
    }

    public String getHost() {
        final String host;

        if (this.config.containsKey(PARAM_HOST)) {
            host = this.config.get(PARAM_HOST);
        } else {
            host = "localhost";
        }

        return host;
    }
}
